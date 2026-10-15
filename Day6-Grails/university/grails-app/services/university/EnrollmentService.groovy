package university

import grails.gorm.transactions.Transactional

@Transactional
class EnrollmentService {
    Enrollment enroll(long studentId,long courseId,Integer grade)
    {
        log.info("Enrolling student with ID: ${studentId} in course with ID: ${courseId} with grade: ${grade}")
        
        try{
        Student student = Student.get(studentId)
        Course course = Course.get(courseId)
        if(!student || !course)
        {
            return null
        }
          Enrollment existingenroll= Enrollment.findByStudentAndCourse(student,course)
        if(existingenroll)
        {
            return null 
        } 
        Enrollment enrollment = new Enrollment(student: student, course: course, grade: grade)
        enrollment.save(flush: true)
        return enrollment  
        }
        catch(Exception e)
        {
            log.error("Error enrolling student: ${e.message}", e)
            throw e
        }
        
        
    } 
    // to delet enrollment
    void unenroll(long enrollmentId) 
    {
        log.info("Unenrolling student with enrollment ID: ${enrollmentId}")
        
       try{ 
        Enrollment enrollment = Enrollment.get(enrollmentId)

        if(enrollment)
        {
            enrollment.delete(flush: true)  
        } 
        }
        catch(Exception e)
        {
            log.error("Error unenrolling student: ${e.message}", e)
            throw e
        }   
    }
    // to calculate GPA
    double calculateGPA(long studentId)
    {
        log.info("Calculating GPA for student with ID: ${studentId}")
    try
    {
         Student student = Student.get(studentId)
        if(!student)
        {
            return 0.0
        }
        List<Enrollment> enrollments = Enrollment.findAllByStudent(student)
        if(enrollments.isEmpty())
        {
            return 0.0
        }
        double total = 0.0
        for(Enrollment enrollment : enrollments)
        {
            total += enrollment.grade
        }
        return total / enrollments.size()     
    } 
    catch(Exception e)
    {
        log.error("Error calculating GPA: ${e.message}", e)
        return 0.0
    }
    }
}
