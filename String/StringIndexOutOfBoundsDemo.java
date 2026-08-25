package String;

import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();

        handleException(text);

        scanner.close();
    }

    public static void generateException(String text) {
        System.out.println(text.charAt(text.length() + 5));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length() + 5));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.toString());
        } catch (RuntimeException e) {
            System.out.println("Runtime exception caught: " + e.toString());
        }
    }
}