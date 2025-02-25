package lesson_5;

import java.util.Scanner;

public class LoopInALoop {
    public static void main(String[] args) {
        //
        // *XXXX i=0, we want 1 star
        // **XXX i=1, we want 2
        // ***XX
        // ****X
        // *****
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num:");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
