package university

class StudentRestController {

    static responseFormats = ['json']

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