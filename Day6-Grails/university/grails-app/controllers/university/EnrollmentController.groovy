package university
import grails.gorm.transactions.Transactional
@Transactional
class EnrollmentController
{
    def index()
    {
        [
            enrollments: Enrollment.list()
        ]
    }
    def create()
    {
        [
            students: Student.list(),
            courses: Course.list()
        ]
    }
    def save()
    {
        def student = Student.get(params.studentId)
        def course = Course.get(params.courseId)

        def existingEnrollment = Enrollment.findByStudentAndCourse(student, course)
        if (existingEnrollment)
        {
            flash.message = "Student is already enrolled in this course."
            redirect(action: "create")
            return
        }


        def enrollment = new Enrollment(student: student, course: course, grade: params.int('grade'))
        if (enrollment.save(flush: true))
        {
            redirect(action: "index")
        }
        else
        {
            render(view: "create", model: [enrollment: enrollment, students: Student.list(), courses: Course.list()])
        }
    }
    def delete(Long id)
    {
    
      def enrollment = Enrollment.get(id)

        if (enrollment)
        {
            enrollment.delete(flush: true)
        }

        redirect(action: "index")
    }

}