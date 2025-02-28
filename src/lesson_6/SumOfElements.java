package lesson_6;

public class SumOfElements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, -3, 4, -5, -6};

        int sumPositive = 0;
        int sumNegative = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sumPositive += numbers[i];
            } else {
                sumNegative += numbers[i];
            }
        }
        System.out.println(sumPositive);
        System.out.println(sumNegative);
    }
}
