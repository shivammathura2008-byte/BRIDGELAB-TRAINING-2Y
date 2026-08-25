package String;

public class NullPointerDemo {
    public static void main(String[] args) {
        handleException();
    }

    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.toString());
        } catch (RuntimeException e) {
            System.out.println("Runtime exception caught: " + e.toString());
        }
    }
}