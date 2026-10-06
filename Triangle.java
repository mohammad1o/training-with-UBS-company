package com.mycompany.javareview;

/**
 *
 * @author khuff
 */
public class Triangle extends Shape {
    private double h,b;
    public Triangle(double h,double b)
    {
        this.h=h;//height
        this.b=b;//base
    }
    public void setHeight(double h)
    {
        this.h=h;
    }
    public double getHeight()
    {
        return h;
    }
    public void setBase(double b)
    {
        this.b=b;
    }
    public double getBase()
    {
        return b;
    }
    public double area()
    {
        return 0.5*b*h;
    }
}
