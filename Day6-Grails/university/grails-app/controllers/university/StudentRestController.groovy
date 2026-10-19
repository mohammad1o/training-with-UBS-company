package university

import grails.rest.RestfulController

class StudentRestController extends RestfulController<Student> {

    static responseFormats = ['json']

    EnrollmentService enrollmentService

    StudentRestController() {
        super(Student)
    }

    def index() {

        Integer max = params.int('max') ?: 10
        Integer offset = params.int('offset') ?: 0

        List<Student> students
        Long total

        if (params.name) {
            students = Student.findAllByNameIlike(
                "%${params.name}%",
                [max: max, offset: offset]
            )

            total = Student.countByNameIlike("%${params.name}%")
        }
        else if (params.email) {
            students = Student.findAllByEmailIlike(
                "%${params.email}%",
                [max: max, offset: offset]
            )

            total = Student.countByEmailIlike("%${params.email}%")
        }
        else {
            students = Student.list(
                max: max,
                offset: offset
            )

            total = Student.count()
        }

        Integer page = (offset / max) + 1

        respond([
            total: total,
            page : page,
            data : students
        ])
    }

    def gpa(Long id) {

        Student student = Student.get(id)

        if (!student) {
            respond([error: "Student not found"], status: 404)
            return
        }

        double gpa = enrollmentService.calculateGPA(id)

        respond([
            studentId: id,
            gpa      : gpa
        ])
    }

    def courses(Long id) {

        Student student = Student.get(id)

        if (!student) {
            respond([error: "Student not found"], status: 404)
            return
        }

        def courses = student.enrollments.collect { enrollment ->
            [
                id   : enrollment.course.id,
                title: enrollment.course.title,
                code : enrollment.course.code
            ]
        }

        respond([
            id           : student.id,
            name         : student.name,
            email        : student.email,
            studentNumber: student.studentNumber,
            courses      : courses
        ])
    }
}