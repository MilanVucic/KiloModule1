package module_1.lesson_2;

import java.util.Scanner;

public class Part4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey, enter your name:");
        String name = input.next();
        System.out.println("Hello there " + name);
        System.out.println("Enter your year of birth:");
        int yearOfBirth = input.nextInt();
        System.out.println("You are " + (2025 - yearOfBirth) + " years old.");
        System.out.println("Enter your weight and height:");
        double weight = input.nextDouble();
        double height = input.nextDouble();
        double bmi = weight / height / height;
        System.out.println("Your BMI:" + bmi);
    }
}
