package NPointerExc;

/*
 * NPointerException.java
 * This class demonstrates a NullPointerException in Java.
 * It shows how to handle the exception using try-catch blocks.
 * NullPointer exception occurs when an application attempts to use an object reference that has the null value.
 * Ocorre em tempo de execução* Happens at runtime** 
 */

public class NPointerException {
    
    public static void main(String[] args) {
        // Example usage
        String str = null;

        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }
}
