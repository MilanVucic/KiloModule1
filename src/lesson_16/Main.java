package lesson_16;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("asd");
        hashSet.add("asd");
        hashSet.contains("asd");
        Iterator<String> iter = hashSet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        for (String value : hashSet) {
            System.out.println(value);
        }
    }
}
