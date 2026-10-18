package university
import grails.rest.Resource
@Resource(uri = '/api/courses')

class Course
{
static responseFormats = ['json', 'html']
String title
String code
Integer creditHours
static hasMany=[enrollments:Enrollment]
static constraints=
{
     code unique:true
     creditHours range: 1..6


}


}