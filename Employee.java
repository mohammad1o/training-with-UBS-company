package com.mycompany.javareview;


public class Employee extends Person implements Printable{
    private double salary;
    public Employee(int age,String name,double salary)
    {
        super(age,name);
        this.salary=salary;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    public double getSalary()
    {
        return salary;
    }
    @Override
    public String toString()
    {
        return super.toString()+"your salary is "+salary;
    }
    public void printDetails()
    {
        System.out.println("the salary is"+salary);
        System.out.println("the name is "+getName());
        System.out.println("the age is"+ getAge());
    }
}
