package module_1.lesson_5;

public class Prime {
    // Write a program to check whether a number is prime or not.
    public static void main(String[] args) {
        int input = 113; // 59/2 = 29
        // 1003 -> No -> ....
        // 113 -> root 11 * 11             11 * 11
        // if we had a divider AFTER root, 19 * 6 = original

        boolean prime = true;
        for (int divider = 2; divider <= Math.sqrt(input); divider++) {
            if (input % divider == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(prime);
    }
}
