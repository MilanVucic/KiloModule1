package module_2.lesson_5;

import module_2.lesson_3.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<? extends Integer> list = new ArrayList<>();
        list.get(5);
        List<? super Integer> anoter = new ArrayList<>();
        anoter.add(5);
        Object a = anoter.get(0);

    }

    private static  <P, R> void doStuff(P param) {
        R result;
    }
}
