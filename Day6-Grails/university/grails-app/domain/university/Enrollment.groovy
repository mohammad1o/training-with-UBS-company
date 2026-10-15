package university

class Enrollment
{
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