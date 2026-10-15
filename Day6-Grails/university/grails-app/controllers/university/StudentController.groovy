package university

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class StudentController {

    StudentService studentService
    EnrollmentService enrollmentService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)

        def student
        if (params.name)
        {
            student = Student.findAllByNameLike("%${params.name}%")
          
        }
         else
            {
                student=studentService.list(params)
            }
        respond student, 
        model:[studentCount: student.size()]
    }

    def show(Long id) {
        Student student = studentService.get(id)
        double gpa = enrollmentService.calculateGPA(id)
        respond student, model: [gpa: gpa]
    }

    def create() {
        respond new Student(params)
    }

    def save(Student student) {
        if (student == null) {
            notFound()
            return
        }

        try {
            studentService.save(student)
        } catch (ValidationException e) {
            respond student.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'student.label', default: 'Student'), student.id])
                redirect student
            }
            '*' { respond student, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond studentService.get(id)
    }

    def update(Student student) {
        if (student == null) {
            notFound()
            return
        }

        try {
            studentService.save(student)
        } catch (ValidationException e) {
            respond student.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'student.label', default: 'Student'), student.id])
                redirect student
            }
            '*'{ respond student, [status: OK] }
        }
    }

    def delete(Long id) 
    {
        if (id == null) {
            notFound()
            return
        }
        studentService.delete(id)
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'student.label', default: 'Student'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() 
    {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'student.label', default: 'Student'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
    def testGpa(Long id)
    {
        double gpa = enrollmentService.calculateGPA(id)
        render "Student ID: ${id}, GPA: ${gpa}"
    }
}
