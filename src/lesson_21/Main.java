package lesson_21;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

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

    // sitting -> si, it, tt, ti, in, ng
    // sittong

    // Levenstein distance
    // sitting kitten -> 3
    // sitting -> kitting -> kittin -> kitten

    public static void main(String[] args) {
        try (CloseableEx c = new CloseableEx()) {
            System.out.println("Doing stuff");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void triangles() {
        try {
            createTriangle();
        } catch (TriangleSideException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void createTriangle() {
        Triangle tr = new Triangle(1, 2, 3);
    }
}
