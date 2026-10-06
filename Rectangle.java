package com.mycompany.javareview;

public class Rectangle extends Shape {
    private double w,h;
    public Rectangle(double w,double h)
    {
        this.h=h;
        this.w=w;
    }
    public void setWeidth(double w)
    {
        this.w=w;
    }

    public double getWeidth() {
        return w;
    }

    public double getHeight() {
        return h;
    }

    public void setHeight(double h) {
        this.h = h;
    }
    
    public double area()
    {
        return w*h;
    }
    
}
