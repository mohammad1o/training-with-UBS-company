package university
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN', 'ROLE_USER'])
class EnrollmentController
{
    EnrollmentService enrollmentService

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
        Enrollment enrollment = enrollmentService.enroll(
            params.long('studentId'),
            params.long('courseId'),
            params.int('grade')
        )

        if (enrollment)
        {
            redirect(action: "index")
        }
        else
        {
            flash.message = "Enrollment failed. Please check if the student and course exist, and that the student is not already enrolled in the course."
            redirect(action: "create")
        }
    }

    def delete(Long id)
    {
        enrollmentService.unenroll(id)

        redirect(action: "index")
    }
}