package String;

import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();

        handleException(text);

        scanner.close();
    }

    public static void generateException(String text) {
        String sub = text.substring(5, 2);
    }

    public static void handleException(String text) {
        try {
            String sub = text.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.toString());
        } catch (RuntimeException e) {
            System.out.println("Runtime exception caught (Java uses StringIndexOutOfBounds for this): " + e.toString());
        }
    }
}