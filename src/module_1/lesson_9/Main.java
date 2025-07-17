package module_1.lesson_9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String sentence = "Th5is is a se4nten2ce";
        System.out.println(sentence.indexOf("j", 10));
        System.out.println(sentence.indexOf("x"));
        System.out.println(sentence.lastIndexOf("j"));

        System.out.println(sentence.substring(1, 3));
        String fixed = sentence.replaceAll("\\d+", "X");
        System.out.println(fixed);
    }

    private static void basicMethods() {
        System.out.println(" \r\t\b\n".isEmpty());
        System.out.println("   \n\r\t".isBlank());
        System.out.println("asdgf".charAt(0));
        String name = "asdasd";
        char[] letters = name.toCharArray();

        String sentence = "Th5is is a se4nten2ce";
        String[] words = sentence.split("\\d+");

        System.out.println(words.length);
        System.out.println(Arrays.toString(words));

        String a = "abc";
        String b = "abt";
        System.out.println(a.compareTo(b));
    }

    private static void escapingChars() {
        System.out.println("\\Alexander\n \"The \t Great\b\"");
    }
}
