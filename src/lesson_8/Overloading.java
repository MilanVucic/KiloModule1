package lesson_8;

public class Overloading {
    public static void main(String[] args) {
        int a = 50;
        int b = 500;

        int max = max(a,b);
        double a1 = 5.3;
        double b1 = 4.5;
        double max1 = max(a1, b1);
        max(5.6,4);
    }

    private static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    private static double max(double a1, double b3) {
        if (a1 > b3) {
            return a1;
        }
        return b3;
    }
}
