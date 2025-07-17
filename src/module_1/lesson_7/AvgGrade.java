package module_1.lesson_7;

import java.util.Arrays;

public class AvgGrade {
    public static void main(String[] args) {
        int[][] grades = {
                {10, 9, 10, 7},
                {6, 7, 8},
                {10, 9, 10, 6, 6, 6},
                {10, 6, 8, 10, 8, 10, 10, 10, 10, 10}
        };
        String[] studentNames = {"Milan", "Mirna", "Tomasz", "Glen"};

        int highestAvgIndex = -1;
        double max = 0;
        for (int i = 0; i < grades.length; i++) {
            double sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j];
            }
            double avg = sum / grades[i].length;
            if (avg > max) {
                max = avg;
                highestAvgIndex = i;
            }
        }
        System.out.println("The highest avg grade is " + max + " by " + studentNames[highestAvgIndex]);

        System.out.println(Arrays.toString(grades));
        System.out.println(Arrays.deepToString(grades));
    }
}
