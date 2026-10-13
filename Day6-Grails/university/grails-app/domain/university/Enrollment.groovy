package university
class Enrollment
{
    
    Integer grade
    Date enrolledtAt= new Date()
    static belongsTo=[student:Student,course:Course] //to make a realtionship between student and course in enrollment table

    static constraints=
    {
        student nullable:false
        course nullable:false
        enrolledtAt nullable:false
    }

}