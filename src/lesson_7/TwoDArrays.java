package lesson_7;

import lesson_5.Main;

public class TwoDArrays {
    public static void main(String[] args) {
        int[][] array = new int[3][5];
        array[0][2] = 5;
        array[1][1] = 2;
        array[1][2] = 3;
        array[1][4] = 9;
        // arr[0] -> 0 0 5 0 0
        // arr[1] -> 0 2 3 0 9
        // arr[2] -> 0 0 0 0 0
        // Matrices, matrix

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (j != array[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        int[][] example = {{1, 1, 2, 123, 34, 5}, {23, 4, 5}, {3, 5, 6}, {4, 73, 4}};

        int[][] anything = new int[4][];
//        anything: [SUBARRAY0, SUBARRAY1, SUBARRAY2, null]
        anything[0] = new int[9];
        anything[1] = new int[3];
        anything[2] = new int[]{1, 2, 3, 4, 5};
        anything[3] = null;
        // 0 0 0 0 0 0 0 0 0
        // 0 0 0
        // 1 2 3 4 5

        for (int i = 0; i < anything.length; i++) {
            if (anything[i] == null) {
                continue;
            }
            for (int j = 0; j < anything[i].length; j++) {
                System.out.print(anything[i][j] + " ");
            }
            System.out.println();
        }
    }
}
