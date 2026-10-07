package com.mycompany.javareview;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;
import static java.util.Collections.list;
import java.util.HashSet;
import java.util.Queue;
import java.util.TreeMap;
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


/////////////method to soreted hash in list 
public  static void printSorted(HashMap<String,List<String>>student)
{
    List<Map.Entry<String,List<String>>> sorted= new ArrayList<>(student.entrySet());// stroed in ArrayList to make all Entry with index
sorted.sort((s1,s2)->
        Integer.compare(s2.getValue().size(),s1.getValue().size()) // to compare between two number integer
);
for (Map.Entry<String,List<String>> s:sorted)
{
    System.out.println(s.getKey()+"  "+s.getValue());   
}
    
}

//////////////////////////////binary search

public static int searchbinary(int []arr,int number)
{
    int left=0;
    int  mid;
    int right=arr.length-1;
    while(left<=right)
    {
        mid=(left+right)/2;
        if(arr[mid]==number)
        {
            return mid;
        }
        if(arr[mid]<number)
        {
            left=mid+1;
        }
        else
        {
            right=mid-1;
        }
    }
    return-1;
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
//Student s1 = new Student(1, 90, 22, "Mohammad");
//
//Course c1 = new Course();
//c1.title = "Java";
//c1.code = "JAVA101";
//
//s1.enroll(c1);
//Person p1=s1;
//p1.printDetails();
//////
///
///
///
///
///
///
///
//////////////////day 3///////////
///
///
///
///
////////ArrayList and LinkedList/////////
//ArrayList<Integer> array= new ArrayList<>();
//LinkedList<Integer> linked= new LinkedList<>();
//array.add(10);
//array.add(20);
//linked.add(40);
//linked.add(50);
//System.out.println(array);
//System.out.println(linked);
//array.add(0,30);
//System.out.println(array);
//for(int i=0;i<10000;i++)
//{
//    array.add(i);
//    linked.add(i);
//}
//long start=System.nanoTime();
//array.add(0,9999);
//long end=System.nanoTime();
//System.out.println("Arraylist Time is :"+ (end-start));
///////////////
/////
/////
//start=System.nanoTime();
//linked.add(0,9999);
//end=System.nanoTime();
//System.out.println("LinkedList time is :"+ (end-start));

///
///
///
///
///
///
//////////Stack using Deque<Integer> with ArrayDeque/////////
///
///
//Deque<Integer> stack= new ArrayDeque<>();/// Deque that mean double-end queue can controll from the start and end
//stack.push(10);
//stack.push(20);
//stack.push(30);
//System.out.println(stack.peek());// peek to look at top 
//System.out.println(stack.pop());//pop to remove from the top
//stack.push(40);
//stack.push(50);
//System.out.println("the top in stack is: " + stack.peek());
//while(!stack.isEmpty())
//{
//    System.out.println(stack.pop());
//}

////////queue///
///
///
///
///
//Queue<String> queue=new LinkedList<>();
//queue.add("job1");
//queue.add("job2");
//queue.add("job3");
//queue.add("job4");
//queue.add("job5");
//System.out.println("this is the first item: "+ queue.peek());////look the first item
//System.out.println("to remove the first item: "+ queue.poll());
//while(!queue.isEmpty())
//{
//    System.out.println("remove the first item: "+queue.poll());
//}
////////////
///
///
///
///
///
///
///
///
///

////////////Hashmap& list///
///
///
///
///
///
//HashMap<String,List<String>> student= new HashMap<>();
//List<String> courseM= new ArrayList<>();
//courseM.add("Java");
//courseM.add("DB");
//courseM.add("SQL");
//List<String>courseA=new ArrayList<>();
//courseA.add("python");
//courseA.add("c++");
//List<String>courseR=new ArrayList<>();
//courseR.add("c#");
//courseR.add("web");
//courseR.add("c++2");
//courseR.add("advance");
//student.put("mohammad", courseM);
//student.put("Ahmad", courseA);
//student.put("rami", courseR);
//System.out.println(student.get("mohammad"));
//for (Map.Entry<String, List<String>> students : student.entrySet())
//{
//    System.out.println("Student: " + students.getKey());
//    System.out.println("Courses: " + students.getValue());
//    
//}
//System.out.println("------------------------------------------------------");
////////////invoke method sorted
///
///
//printSorted(student);

/////////////////////////
///
///
///
///////////////////////////////////////////HashSet & List
///
///
///
//List<String> name = new ArrayList<>();
//name.add("mohammad");
//name.add("Ahmad");
//name.add("khalid");
//name.add("mohammad");
//for(String s:name)
//{
//    System.out.println(s);
//}
//System.out.println("_____________________________________");
//HashSet<String>uniqname= new HashSet<>(name);
//System.out.println("HashSet with  uniqname = "+ uniqname);

///
///
///
///
///////////////////////////TreeMap
///
///
///
///
//TreeMap<String,Integer> product=new TreeMap<>();
//product.put("Iphone",2000);
//product.put("apple",20);
//product.put("banana",25);
//product.put("Samsung",2400);
//for(Map.Entry<String,Integer> p: product.entrySet())
//{
//    System.out.println(p.getKey()+"  "+p.getValue());
//}


///
///
///
///
///
///
///
///
////////////////////frequency counter using hashmap
///
///
///
///
///
//String text = "java sql java python java sql";
//String [] t1 = text.split(" ");
//HashMap<String ,Integer> count= new  HashMap<>();
//for(String  t : t1)
//{
//    if(!count.containsKey(t))
//    {
//        count.put(t,1);
//    }
//    else
//    {
//        count.put(t, count.get(t)+1);
//    }
//}
//            System.out.println(count);
//String text = "java sql java python java sql";
//String [] word = text.split(" ");
//HashMap  <String ,Integer> countWord= new HashMap<>();
//for( String words :word)
//{
//    if(!countWord.containsKey(words))
//    {
//        countWord.put(words,1);
//    }
//    else
//    {
//        countWord.put(words,countWord.get(words)+1);
//    }
//}
//            System.out.println(countWord);





////////////////////////////////////////binary search method
///
///
///
///
///
//int[] number1={12,14,16,26,40,50};
//System.out.println(searchbinary(number1,16));
///
///
///
///
///
///
///
/*
Big-O Complexity

ArrayList:
get(index)       -> O(1)
add(value)       -> O(1) usually when adding at the end
add(index,value) -> O(n)
remove(index)    -> O(n)

LinkedList:
get(index)       -> O(n)
add(value)       -> O(1) when adding at the end
remove first/last-> O(1)
remove by value  -> O(n)

HashMap:
get(key)         -> O(1) average
put(key,value)   -> O(1) average
remove(key)      -> O(1) average

TreeMap:
get(key)         -> O(log n)
put(key,value)   -> O(log n)
remove(key)      -> O(log n)
*/



///
///
///
///
////////////////////mini   project inventory  using Product class
///
///
///
//
HashMap<String,Product> inventory= new HashMap<>();
Product p1=new Product("p001","iphone",3000);
Product p2=new Product("p002","samsung",2000);
inventory.put(p1.getCode(),p1);
inventory.put(p2.getCode(), p2);
System.out.println(inventory);
while(true)
{
     System.out.println("========== Inventory Menu ==========");
    System.out.println("1. Add Product");
    System.out.println("2. Remove Product");
    System.out.println("3. Search Product");
    System.out.println("4. List Products");
    System.out.println("5. Exit");
    System.out.print("Choose option: ");
    int choice =read.nextInt();
     switch(choice)
    {
        case 1:
            read.nextLine();
            System.out.println("Enter product code");
            String code=read.nextLine();
            
            System.out.println("Enter product name");
            String name=read.nextLine();
            
            System.out.println("Enter product price");
            double price=read.nextDouble();
            
            Product newproduct=new Product(code,name,price);
            inventory.put(code, newproduct);

    System.out.println("Product added successfully");
            break;

        case 2:
            read.nextLine();
            System.out.println("Enter Product code to Remove: ");
            String removecode=read.nextLine();
            
            if(inventory.containsKey(removecode))
            {
                inventory.remove(removecode);
                System.out.println("product removed successful");
            }
            else
            {
                System.out.println("Product not found");
            }
            break;

        case 3:
            read.nextLine();
            System.out.println("Enter Product code to  Search:");
            String searchcode = read.nextLine();
             if(inventory.containsKey(searchcode))
             {
                  Product foundProduct = inventory.get(searchcode);
                  System.out.println("Product found:");
                  System.out.println(foundProduct);
             }
             else
             {
                 System.out.println("Product not found");
             }
            break;

        case 4:
            if(inventory.isEmpty())
            {
                System.out.println("Inventory is empty");
            }
   
            else
            {
                for(Map.Entry<String, Product> item : inventory.entrySet())
                {
                    System.out.println(item.getValue());
                }
            }

            break;

        case 5:
            System.out.println("Exit");
            return;

        default:
            System.out.println("Invalid choice");
    }
    
    
}






        






    }
}
