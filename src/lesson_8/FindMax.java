package lesson_8;

public class FindMax {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {1, 2, 3, 4, 13, 6, 7, 8};
        int[] arr3 = {1, 2, 55, 4, 5, 6, 7, 8};
        int[] arr4 = {1, -5};
        System.out.println(max(arr1));
        int max2 = max(arr2);
        System.out.println(max2);
    }

    public static int getANumber() {
        return 10;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
