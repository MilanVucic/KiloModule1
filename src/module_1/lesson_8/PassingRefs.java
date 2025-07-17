package module_1.lesson_8;

import java.util.Arrays;

public class PassingRefs {
    public static void main(String[] args) {
        // Is Java pass by reference or pass by value
        int a = 50; // a -> 12381 -> 50
        changeA(a);
        System.out.println(a);

        int[] arr = {1, 2, 3}; // memory -> 1000 -> 1, 1001 -> 2, 1002 -> 3
        changeArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    // arr -> 1000
    private static void changeArr(int[] arr) {
//        arr = new int[4];
        arr[0] = 500;
    }

    // a -> 90012312 -> 50
    public static void changeA(int a) {
        a = 500;
    }
}
