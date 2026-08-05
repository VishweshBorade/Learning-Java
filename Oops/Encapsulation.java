package Oops;

public class Encapsulation {
    public static void main(String a[]){
        Human obj = new Human();

        obj.setAge(25);// setting the age using setter method
        obj.setName("Navin Reddy");// setting the name using setter method

        System.out.println("Age: " + obj.getAge() + " Name: " + obj.getName());// accessing the private variables using getter methods

    }
}

class Human{
    private int age;// private variables
    private String name;// private variables
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    


}
