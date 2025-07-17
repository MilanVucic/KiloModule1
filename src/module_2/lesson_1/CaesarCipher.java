package module_2.lesson_1;

public class CaesarCipher extends SubstituteCipher{
    private int key;
    private char[] alphabet;

    public CaesarCipher(int key, char[] alphabet) {
        this.key = key;
        this.alphabet = alphabet;
    }

    private int getCharPosition(char letter) {
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == letter) {
                return i;
            }
        }
        throw new IllegalArgumentException("This letter is not supported");
    }

    @Override
    public char getEncryptSubstitute(char input) {
        int current = getCharPosition(input);
        return alphabet[(current + key) % alphabet.length];
    }

    @Override
    public char getDecryptSubstitute(char input) {
        int current = getCharPosition(input);
        return alphabet[(current - key) % alphabet.length];
    }
}
