
package com.mycompany.javareview;
import java.util.ArrayList;

/**
 *
 * @author khuff
 */
public class Student extends Person  implements Printable,enrollment {
    private int id;
    private double grade;
    ArrayList<Course>courses= new ArrayList<>();
    public Student(int id,double grade,int age,String name)
    {
        super(age,name);
        this.grade=grade;
        this.id=id;
    }
    @Override
    public void printDetails()
    {
        System.out.println("your name is: "+super.getName());
        System.out.println("your age is: "+super.getAge());
        System.out.println("id is :"+id);
        System.out.println("grade is:"+grade);
    }
    @Override
    public boolean canEnroll(Course course )
    {
        return course!=null;
    }
    public void enroll(Course course)
{
    if (canEnroll(course))
    {
        courses.add(course);
        System.out.println("Course added");
    }
    else
    {
        System.out.println("Cannot enroll");
    }
}
   
}
