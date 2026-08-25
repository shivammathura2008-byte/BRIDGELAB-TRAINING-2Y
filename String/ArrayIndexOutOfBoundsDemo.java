package String;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[3];

        System.out.println("Enter 3 names:");
        for (int i = 0; i < 3; i++) {
            names[i] = scanner.next();
        }

        handleException(names);

        scanner.close();
    }

    public static void generateException(String[] names) {
        System.out.println(names[5]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.toString());
        } catch (RuntimeException e) {
            System.out.println("Runtime exception caught: " + e.toString());
        }
    }
}