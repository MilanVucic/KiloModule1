package module_1.lesson_6;

public class Avg {
    public static void main(String[] args) {
        // Write a program to calculate the average value of array elements.

        int[] numbers = {}; // 9.25

        if (numbers.length > 0) {
            double sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            System.out.println(sum / numbers.length);
        } else {
            System.out.println("Nothing to average...");
        }
    }
}
