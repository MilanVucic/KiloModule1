package module_2.lesson_3;

import module_2.lesson_1.CaesarCipher;
import module_2.lesson_1.Cipher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InfoDisplayer infoDisplayer = new ConsoleInfoDisplayer();
        Cipher cipher = new CaesarCipher(3, new char[]{'a', 'b', 'c', 'd', 'e'});
        infoDisplayer.onMessage(cipher.encrypt("abbced"), MessageType.INFO);
    }

    private static void intExample() {
        Person p1 = new Person("Alexander", 31);
        Person p2 = new Person("Glen", 99);
        Person p3 = new Person("Jay", 18);
        Person p4 = new Person("Marco", 19);
        Person p5 = new Person("Marco", 22);
        Person p6 = new Person("Marco", 66);
        Person p7 = new Person("Marco", 33);
        List<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);
        people.add(p7);

        List<String> strings = new ArrayList<>();
        strings.add("assdad");
        strings.add("asdqweqweqwe");
        strings.add("bsdaa");
        strings.add("asd");
        Collections.sort(strings, new MyLengthComparator());
        System.out.println(strings);
    }
}
