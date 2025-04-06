
class StaticDemo {
    // Static variable
    static int count;

    // Static block (executed once when the class is loaded)
    static {
        System.out.println("Static Block Executed!");
        count = 100;  // Initializing static variable
    }

    // Static method
    static void displayCount() {
        System.out.println("Static Variable Count: " + count);
    }

    // Constructor to increment count when an object is created
    StaticDemo() {
        count++;
    }
}

public class StaticExample {
    public static void main(String[] args) {
        // Accessing static method without creating an object
        StaticDemo.displayCount();

        // Creating objects
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        // Accessing static method again to see updated value
        StaticDemo.displayCount();
    }
}