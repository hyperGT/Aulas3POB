package NPointerExc;

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
