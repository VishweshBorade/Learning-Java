package String;

public class string {
    public static void main(String[] args) {
        String name = "navin"; // creating a string using string literal
        name = name+" Reddy"; // concatenation of string
        System.out.println("Hello "+name);// prints the concatenated string

        String s1 ="Navin"; // creating a string using string literal
        String s2 = "Navin"; // creating a string using string literal
        String s3 = new String("Navin"); // creating a string object using new keyword
[l]
        System.out.println(s1==s2);// true because both refer to same instance
        System.out.println(s1==s3);// false because s3 refers to instance created in heap memory
        System.out.println(s1.equals(s3));// true because content is same
        System.out.println(s1.equalsIgnoreCase(s3));// true because content is same ignoring case
    }
}
