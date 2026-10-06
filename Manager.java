package com.mycompany.javareview;

public class Manager extends Employee {
     private String dep;
     
    public Manager(String dep,int age,String name,double salary){
        super(age,name,salary);
        this.dep=dep;
    }
    public void setDep(String dep)
    {
        this.dep=dep;
    }
    public String getDep()
    {
        return dep;
    }
    public String toString()
    {
        return super.toString()+"the department is :"+dep;
    }
}
