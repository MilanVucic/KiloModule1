package module_1.lesson_5;

public class Main {
    public static void main(String[] args) {
        int input = 1000;
        int divider = 50;
        int i = 1;
        int sum = 0;
        while (divider * i <= input) {
            System.out.println("Running " + i);
            sum += divider * i;
            i++;
        }

        System.out.println("----------------");
        int sum2 = 0;
        for (int j = divider; j <= input; j += divider) {
            System.out.println("Running " + j);
            if (j % divider == 0) {
                sum2 += j;
            }
        }
        System.out.println("Sum of dividers is : " + sum);
        System.out.println("Sum of dividers is : " + sum2);
    }
}
