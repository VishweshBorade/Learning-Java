package String;

public class Example {
    public static void main(String[] args) {//creating a string using string literal
        String name = new String("Rushi"); //creating a string object using new keyword
        System.out.println("Hello " + name);//concatenation of string
        System.out.println(name.charAt(2));//prints the character at index 2
        System.out.println(name.concat(" Survashe"));//concatenates the string with itself
    }
    
}
