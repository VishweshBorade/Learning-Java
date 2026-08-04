package String;

public class Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Navin");
        System.out.println("StringBuffer capacity: " + sb.capacity());// know the capacity of string buffer

        sb.append(" Reddy");// appending the string
        System.out.println("StringBuffer after append: " + sb);// prints the appended string
        
        // String str = sb.toString();// converting string buffer to string
        // System.out.println("String after converting from StringBuffer: " + str);//
        // prints the string

        sb.deleteCharAt(1);// deleting the character at index 1
        System.out.println("StringBuffer after deleting character at index 1: " + sb);

        sb.insert(1, "a");// inserting the character 'a' at index 1
        System.out.println("StringBuffer after inserting character 'a' at index 1: "+ sb);

        sb.setLength(30);// setting the length of string buffer to 30
        System.out.println("StringBuffer after setting length to 30: " + sb);

        sb.ensureCapacity(100);// ensuring the capacity of string buffer to 100
        System.out.println("StringBuffer after ensuring capacity to 100: " + sb.capacity());//
        
    }

}
