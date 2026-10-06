package com.mycompany.javareview;


public abstract class Shape {
    public abstract double area();
    public static void printArea(Shape shape)
    {
        System.out.println(shape.area());
    }
    
}
