package module_2.lesson_1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    // a -> f
    // f -> c
    // c -> b
    // b -> d
    // d -> e
    // e -> a
    public static void main(String[] args) {
        Cipher cipher = new CaesarCipher(3, new char[]{'a', 'b', 'c', 'd', 'e', 'f'});
        Map<Character, Character> encMap = new HashMap<>();
        encMap.put('a', 'f');
        encMap.put('f', 'c');
        encMap.put('c', 'b');
        encMap.put('b', 'd');
        encMap.put('d', 'e');
        encMap.put('e', 'a');
        Map<Character, Character> decMap = new HashMap<>();
        decMap.put('f', 'a');
        decMap.put('c', 'f');
        decMap.put('b', 'c');
        decMap.put('d', 'b');
        decMap.put('e', 'd');
        decMap.put('a', 'e');
        Cipher cipher2 = new CustomSubCipher(encMap, decMap);

        System.out.println(cipher.encrypt("abbcdef"));
        System.out.println(cipher2.encrypt("abbcdef"));
    }
}
