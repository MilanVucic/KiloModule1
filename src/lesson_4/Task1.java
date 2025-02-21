package lesson_4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Calculate the sum of first N numbers, user enters N
        // 10 -> 10 + 9 + 8 ... + 1 -> ?
        System.out.println("Enter N:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int sumFor = 0;
        for (int counter = 1; counter <= number; counter++) {
            sumFor += counter;
        }
        System.out.println("sumFor = " + sumFor);

        int sum = 0;
        while (number >= 1) {
            sum += number--;
        }
        System.out.println("sum = " + sum);
    }
}
