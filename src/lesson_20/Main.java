package lesson_20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            createFile();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void createFile() throws FileNotFoundException {
        FileReader fileReader = new FileReader("asd");
    }

    private static void finallyBlock() {
        try {
            System.out.println("hey from try");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("Running finally");
        }
    }

    private static void catchingOurExc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        try {
            Person person = new Person("milan", age);
        } catch (IllegalArgumentException e) {
            System.out.println("Person not created. " + e.getMessage());
        }
    }

    private static void excExample() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter your age:");
                String input = scanner.nextLine();
                int age = Integer.parseInt(input);
                System.out.println("Age: " + age);
                int[] arr = {1, 2, 3};
                System.out.println("Enter an index:");
                int index = scanner.nextInt();
                System.out.println(arr[index]);
                break;
            } catch (NumberFormatException | InputMismatchException exception) {
                System.out.println("You entered your age wrong.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Your index was wrong. Enter from 0-2");
            } catch (Exception e) {
                System.out.println("Something went wrong...");
            }
        }
    }
}
