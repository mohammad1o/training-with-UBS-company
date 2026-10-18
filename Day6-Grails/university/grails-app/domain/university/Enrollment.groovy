package university
import grails.rest.Resource
@Resource(uri = '/api/enrollments')
class Enrollment
{
    static responseFormats = ['json', 'html'] // REST API support 
    Integer grade
    Date enrolledAt = new Date()

    static belongsTo = [
        student: Student,
        course: Course
    ]

    static constraints =
    {
        student nullable: false
        course nullable: false
        enrolledAt nullable: false
    }
}