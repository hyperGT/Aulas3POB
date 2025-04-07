package ClassNotFound;

/**
 * ClassNotFoundException.java
 * This class demonstrates a ClassNotFoundException in Java.
 * It shows how to handle the exception using try-catch blocks.
 * ClassNotFoundException occurs when an application tries to load a class at runtime using its string name, but no definition for the class with the specified name could be found.
 */

public class Example {
    
    public static void main(String[] args) {
        try {
            // Attempt to load a class that does not exist
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught a ClassNotFoundException: " + e.getMessage());
        }
    }
}
