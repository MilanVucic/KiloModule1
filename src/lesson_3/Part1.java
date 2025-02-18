package lesson_3;

import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        // 0-18 -> school
        // 18-65 -> work
        // 65+ -> retire
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = scanner.nextInt();

        if (age <= 18) {
            System.out.println("Go to school.");
        } else if (age <= 65) {
            System.out.println("Go to work.");
        } else {
            System.out.println("Go to retirement.");
        }
    }
}
