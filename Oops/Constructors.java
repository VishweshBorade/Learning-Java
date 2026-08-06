package Oops;

public class Constructors {// overloading of constructor is not possible in java but we can overload the constructor by using different number of parameters or different types of parameters
    class Student{
        String name;
        Student(){// constructor of Student class
            this(25);// calling the constructor with parameter from the constructor without parameter
            name = "Navin";// initializing the name variable
        }
        Student(int age){// constructor of Student class with parameter
            System.out.println("Age: " + age);
        }
    }
    Student s = new Student();// creating an object of Student class which will call the constructor and initialize the name variable
    public static void main(String a[]){
        Constructors obj = new Constructors();
        System.out.println("Name: " + obj.s.name);// accessing the name variable of Student class
    }
}
