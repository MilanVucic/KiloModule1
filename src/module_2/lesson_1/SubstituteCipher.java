package module_2.lesson_1;

public abstract class SubstituteCipher implements Cipher{
    public abstract char getEncryptSubstitute(char input);
    public abstract char getDecryptSubstitute(char input);

    @Override
    public String encrypt(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            sb.append(getEncryptSubstitute(input.charAt(i)));
        }
        return sb.toString();
    }

    @Override
    public String decrypt(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            sb.append(getDecryptSubstitute(input.charAt(i)));
        }
        return sb.toString();
    }
}
