package module_2.lesson_1;

import java.util.Map;

// abcdef
// a -> f
// f -> c
// c -> b
// b -> d
// d -> e
public class CustomSubCipher extends SubstituteCipher{
    private Map<Character, Character> encryptMap;
    private Map<Character, Character> decryptMap;

    public CustomSubCipher(Map<Character, Character> encryptMap, Map<Character, Character> decryptMap) {
        this.encryptMap = encryptMap;
        this.decryptMap = decryptMap;
    }

    @Override
    public char getEncryptSubstitute(char input) {
        return encryptMap.get(input);
    }

    @Override
    public char getDecryptSubstitute(char input) {
        return decryptMap.get(input);
    }
}
