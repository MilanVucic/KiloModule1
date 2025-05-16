package lesson_21;

import java.util.Arrays;

public class Main {
    // Additional HW: Make autocorrecter
    // It needs to contain words from a certain language
    // Given a string, it needs to provide several potential suggestions
    // Based on that word of what we wanted to type
    // A couple of common typing errors are: extra letter, missing letter,
    // Switching 2 adjacent letters
    // stuyd -> study, stud
    // renam -> rename, ream
    // read -> read, ready, red

    public static void main(String[] args) {
        try {
            createTriangle();
        } catch (TriangleSideException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    private static void createTriangle() {
        Triangle tr = new Triangle(1,2,3);
    }
}
