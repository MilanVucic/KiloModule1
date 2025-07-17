package module_1.lesson_6;

public class Max {
    public static void main(String[] args) {
        // Write a program to find the maximum value of an array.
        // tickets valid for X amount of days
        // x * 60 * 60 * 1000 ~ > 2B
        int[] numbers = {-3, -4, -5, -12};
        if (numbers.length > 0) {
            int max = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            System.out.println(max);
        } else {
            System.out.println("No max.");
        }
    }
}
