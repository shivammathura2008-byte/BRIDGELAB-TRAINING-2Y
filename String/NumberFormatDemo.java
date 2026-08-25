package String;

import java.util.Scanner;

public class NumberFormatDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-numeric string: ");
        String text = scanner.next();

        handleException(text);

        scanner.close();
    }

    public static void generateException(String text) {
        int number = Integer.parseInt(text);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: " + e.toString());
        } catch (RuntimeException e) {
            System.out.println("Runtime exception caught: " + e.toString());
        }
    }
}