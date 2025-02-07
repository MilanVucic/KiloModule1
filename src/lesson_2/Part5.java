package lesson_2;

import java.util.Scanner;

public class Part5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("Milan 50 70.4");
        String name = scanner.next();
        int something = scanner.nextInt();
        double doubly = scanner.nextDouble();
        System.out.println(name);
        System.out.println(something);
        System.out.println(doubly);
    }
}
