package module_1.lesson_11;

import java.util.Arrays;

public class Student extends Person{
    int[] grades;

    void printMe() {
        System.out.println(firstName + " " + Arrays.toString(grades));
    }
}
