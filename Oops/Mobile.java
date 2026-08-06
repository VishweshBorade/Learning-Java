package Oops;

public class Mobile {
    // Static variable
    static int totalMobiles = 0;

    // Non-static variable
    String brand;

    // Static block
    static {
        System.out.println("Mobile class loaded!");
    }

    // Constructor
    public Mobile(String brand) {
        this.brand = brand;
        totalMobiles++; // Increase count
    }

    // Static method
    static void printTotal() {
        System.out.println("Total mobiles: " + totalMobiles);
    }

    // Non-static method
    void display() {
        System.out.println("Brand: " + brand);
    }

    public static void main(String a[]) {
        // Usage
        Mobile m1 = new Mobile("Apple"); // Static block runs, totalMobiles = 1
        Mobile m2 = new Mobile("Samsung"); // totalMobiles = 2
        Mobile.printTotal(); // Output: Total mobiles: 2
    }
}
