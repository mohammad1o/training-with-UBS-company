package com.mycompany.javareview;

/**
 *
 * @author khuff
 */
public class Circle extends Shape {
    private double r;
    public Circle(double r)
    {
        this.r=r;
    }
    public void setRadius(double r)
    {
        this.r=r;
    }
    public double getRadius()
    {
        return r;
    }
    @Override
    public double area()
    {
        return 3.14*r*r;
    }
}
