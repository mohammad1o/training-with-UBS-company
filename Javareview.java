package com.mycompany.javareview;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
 *
 * @author khuff
 */

public class Javareview {
    ////////////////Create helper methods:///////////////
public static boolean isEven(int num)
{
    if (num%2==0)
    {
        return true;
    }
    else
    {
        return false;
    }
}
public static int Factorial(int num)
{
    int result=1;
    for(int i = num;i>0;i--)
    {
        result*=i;
        
    }
    return result;
}
public  static String ReverseString(String x)
{
    String res="";
    for(int i =x.length()-1;i>=0;i--)
    {
        res+=x.charAt(i);
    }
    return res;
}
public static int Divide(int a,int b)
{
    if(b==0)
    {
        throw new ArithmeticException("cannot divide by zero");
    }
    return a/b;
}
////////////////////Create helper methods:////////////////////
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
//        System.out.println("Enter Your Name :");
//       String name= read.nextLine();
//        System.out.println("Enter your age:");
//        int age= read.nextInt();
//        System.out.println("enter your salary");
//        double salary =read.nextDouble();
//        System.out.println("your name is :"+name);
//        System.out.println("your age is :" + age);
//        System.out.println("your salary is "+ salary);
//     
//int x=5;
//int y=8;
//        System.out.println(x+y);
//        System.out.println(x*y);
//        System.out.println(y-x);
//        System.out.println(y/x);
//        System.out.println(y%x);
//  int age =22;
//        System.out.println(age>22);
//        System.out.println(age<22);
//        System.out.println(age>=22);
//        System.out.println(age==22);
//        System.out.println(age!=22);

///////////////////////////////////////////////if/else, switch statement and while loop//////////////////
//System.out.println("Pleas Enter your age:");  
// int age=read.nextInt();
//        
//if (age<13)
//{
//    System.out.println("child");
//}
//else if(age<=17 && age>=13)
//{
//    System.out.println("Teenager ");
//}
//else
//{
//    System.out.println("senior ");   
//}
//  
//System.out.println("Enter your Grade from 1 to 5");
//int grade = read.nextInt();
//switch(grade)
//{
//    case 1:
//        System.out.println("very poor");
//        break;
//    case 2:
//        System.out.println("poor");
//        break;
//    case 3:
//        System.out.println("good");
//        break;
//    case 4:
//        System.out.println("very good");
//        break;
//    case 5:
//        System.out.println("excellent");
//        break;
//    default:
//        System.out.println("Invalid grade");
//}

//        System.out.println("Enter your Number:");
//        int num = read.nextInt();
//        for (int i =1;i<=10;i++)
//        {
//            System.out.println(num+""+"*"+i+"="+(num * i));
//        }
//
//int sum =0;
//int num;
//   
//
//while(sum<50)
//    
//{
//    System.out.println("Enter any number:");
//     num = read.nextInt();
//
//    int oldSum = sum;
//    sum += num;
//
//    System.out.println(oldSum + " + " + num + " = " + sum);
//   
//    
//}
//////////////////////////////////////////if/else, switch statement and while loop//////////////////
///
///
////////////////////isEven(int n), factorial(int n), reverseString(String s)////////////
//System.out.println("Enter any number to check if even!");
//int num = read.nextInt();
//        System.out.println(isEven(num));
//System.out.println(Factorial(5));
//System.out.println("Enter any word!");
//String word = read.nextLine();
//System.out.println(ReverseString(word));

/////////////////Declare a 1D int array of size 10; fill with random numbers; print min, max, and average./////

//int []number=new int [10];
//for(int i =0;i<=number.length-1;i++)
//{
//    System.out.println("Enter any Number "+i+":");
//    number[i]=read.nextInt();
//    
//}
//int max=number[0];
//for(int i =0;i<=number.length-1;i++)
//{
//    
//    if(number[i]>max)
//    {
//        max=number[i];
//
//    }
//}
// System.out.println("the max number is ="+max);
// 
// int min=number[0];
// for(int i = 0; i<=number.length ; i++ )
// {
//   if (number[i]<min)
//   {
//       min=number[i];
//   }
// }
//        System.out.println("the min number is :"+min);
//        
//        int sum=0;
//        double avg;
//        for(int i=0;i<number.length;i++)
//        {
//            sum+=number[i];
//        }
//        avg=(double)sum/number.length;
//        System.out.println("the avg ="+avg);
////////////////////////////////////////////Practice key String methods//////////////////////////////
//String word="          hello java world           ";
//word=word.trim();
//word=word.toUpperCase();
//word=word.replace("JAVA", "SQL");
//System.out.println(word);
//String [] res=word.split(" ");
//for(int i = 0; i < res.length; i++)
//{
//    System.out.println(res[i]);
//}
///////////////////////////////////////////exception///////////////////////////////////////// 
//System.out.println("Enter a first number ");
//int a = read.nextInt();
//System.out.println("Enter the secand Number");
//int b= read.nextInt();
//try{
//    int res=Divide(a,b);
//    System.out.println("Result="+res);
//}
//catch(ArithmeticException e){
//    System.out.println("Error:"+e.getMessage());
//}
///////////////////ArrayList//////////////////////////
//ArrayList<String> products= new ArrayList<>();
//products.add("iphone");
//products.add("samsung");
//products.add("huawei");
//products.add("xiaomi");
//products.add("nokia");
//products.remove("huawei");
//
//for(String product : products)/////for each
//{
//    System.out.println(product);
//}
///////////////////////////////////////////////Hashmap///////////////////
//HashMap<String,Integer>student=new HashMap<>();
//student.put("Mohammad", 90);
//student.put("Ahmad",97);
//student.put("Rami",99);
//for(Map.Entry<String,Integer> students : student.entrySet())
//{
//    System.out.println(students.getKey());
//    System.out.println(students.getValue());
//    
//}
////////////////////////////new class Student
//Student n1= new Student();
//n1.name="mohammad";
//n1.grade=90;
//n1.id=1;
//System.out.println(n1.name);
//System.out.println(n1.grade);
//System.out.println(n1.id);
//Course c1= new Course();
//c1.title="Database";
//c1.code="D1B1";
//Course c2=new Course();
//c2.title="java";
//c2.code="j1v1";
//n1.courses.add(c1);
//n1.courses.add(c2);
//for(Course course :n1.courses)
//{
//    System.out.println(course.title +"--"+course.code);
//}


////
///
///
///
////////Day2////////
///
///
///
///
/////////////////////////////class with constructor and encapsulation
//Person p1 = new Person();
//p1.setAge(10);
//p1.setName("mohammad");
//            System.out.println(p1.getAge());
//            System.out.println(p1.getName());
//            
//Person p2 =  new Person(20,"ahmad");
////            System.out.println(p2.getage());
////            System.out.println(p2.getname());
//System.out.println(p2);

///
///
///
///////////////////////////////////abstract class  and polymorphisem
///
///
///

//Shape s1= new Circle(5);
//
//Shape s2= new Rectangle(4,5);
//Shape s3= new Triangle(3,4);
////System.out.println(s1.area());
////System.out.println(s2.area());
////System.out.println(s3.area());
////s1.printArea(s1);
////s2.printArea(s2);
////s3.printArea(s3);
//Shape.printArea(s1);
//Shape.printArea(s2);
//Shape.printArea(s3);
//if (s1 instanceof Circle)
//{
//    Circle c1=(Circle) s1;
//    System.out.println(c1.getRadius());
//}
//
//if (s2 instanceof Rectangle)
//{
//    Rectangle r1=(Rectangle) s2;
//    System.out.println(r1.getHeight());
//    System.out.println(r1.getWeidth());
//}
//
//if (s3 instanceof Triangle)
//{
//    Triangle t1=(Triangle)s3;
//    System.out.println(t1.getBase());
//    System.out.println(t1.getHeight());
//}
///
///
///
//////////////////////////list and shape
///
///
//List<Shape>shape= new ArrayList();
//shape.add(new Circle(5));
//shape.add(new Triangle(5,3));
//shape.add(new Rectangle(2,3));
//for(Shape shapes :shape)
//{
//    System.out.println(shapes.area());
//}
//////////////////mini project
///
///
///
Student s1 = new Student(1, 90, 22, "Mohammad");

Course c1 = new Course();
c1.title = "Java";
c1.code = "JAVA101";

s1.enroll(c1);
Person p1=s1;
p1.printDetails();

    }
}
