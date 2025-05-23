package lesson_22;

import java.util.ArrayList;
import java.util.List;

public class Example {
    final int a = 50;
    final List<Integer> list = new ArrayList<>();

    public void something() {
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
    }

    public final void doStuff() {
        System.out.println("doing stuff");
    }

    public static void anything() {
        Main.breakLabel();
    }
}
