package module_1.lesson_10;

public class MostCommonLetter {
    public static void main(String[] args) {
        String input = "aazzzzabcccddddeeeeeezzzzz";
        System.out.println(getMostCommonLetter(input));
    }

    public static char getMostCommonLetter(String input) {
        int[] letterCount = new int[26];
        // 0 -> a
        // 1 -> b
        // 2 -> c
        // ...
        // 25 -> z
        // 0 2 1 0 0 0 2 0 4 0 0 5 0 3 0 0 0 0 0
        input = input.toUpperCase();
        // a -> 67
        // b -> 68
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            int letterIndex = letter - 'A';
            letterCount[letterIndex]++;
        }

        int max = 0;
        int maxLetterIndex = -1;
        for (int i = 0; i < letterCount.length; i++) {
            if (letterCount[i] > max) {
                max = letterCount[i];
                maxLetterIndex = i;
            }
        }

        return (char) ('A' + maxLetterIndex);
    }
}
