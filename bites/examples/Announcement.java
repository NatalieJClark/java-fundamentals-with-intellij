package bites.examples;

// Learning to use static methods (beyond main), which are called on a class, rather than on an instance of a class
public class Announcement {
    // a static method that prints a String, but returns nothing
    public static void alert(String message) {
        System.out.println(message);
    }

    // a normal main method signature
    public static void main(String[] args) {
        // call our static method
        Announcement.alert("All trains to London are running early - good luck!");
    }
}
