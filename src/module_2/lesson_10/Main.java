package module_2.lesson_10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(palindrome("abbcbba"));
        System.out.println(palindrome("abdbcbba"));
        System.out.println(palindrome(""));
        System.out.println(palindrome("asdf"));
        System.out.println(palindrome("abba"));
        System.out.println(palindrome("abecceba"));
        // xaax

        // is a == a? if so, move on to palindrome(bb)
        // if not, return false
        System.out.println("-------------");
        System.out.println(isInArray(5, new int[]{1, 2, 3, 4, 5, 6}));
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        System.out.println(isInList(5, list));
    }

    private static boolean isInList(int number, List<Integer> elements) {
        Integer first = elements.remove(0);
        if (first == null) {
            return false;
        }
        if (first == number) {
            return true;
        }
        return isInList(number, elements);
    }

    private static boolean isInArray(int number, int[] array) {
        return isInArrayHelper(number, array, 0);
    }

    private static boolean isInArrayHelper(int number, int[] array, int index) {
        if (index >= array.length) {
            return false;
        }
        if (number == array[index]) {
            return true;
        }
        return isInArrayHelper(number, array, index + 1);
    }

    // returns true if string is read the same from back
    // abba
    private static boolean palindrome(String input) {
        if (input.length() <= 1) {
            return true;
        }
        // 012
        // dog
        // string.substring(1,2) -> o
        char first = input.charAt(0);
        char last = input.charAt(input.length() - 1);
        if (first != last) {
            return false;
        }
        return palindrome(input.substring(1, input.length() - 1));
    }

    // Fibonacci
    // 1,1,2,3,5,8,13,21,34,55...
    private static int fibonacci(int num) {
        if (num <= 2) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    // fact(5) = 5 * fact(4)
    // fact(4) = 4 * fact(3)
    private static int fact(int num) {
        if (num == 1) {
            return 1;
        }
        return num * fact(num - 1);
    }

    // sum(10) = 10 + sum(9) = 10 + 9 + sum(8)
    // sum(9) = 9 + sum(8)
    // sum(8) = 8 + sum(7)
    private static int recSum(int number) {
        if (number == 0) {
            return 0;
        }
        int previousSum = recSum(number - 1);
        return number + previousSum;
    }

    private static void printAllPaths(String root) {
        printAllPaths(Path.of(root));
    }

    private static void printAllPaths(Path root) {
        try {
            for (Path subpath : Files.newDirectoryStream(root)) {
                if (Files.isDirectory(subpath)) {
                    printAllPaths(subpath);
                }
                System.out.println(subpath);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void countdown(int number) {
        if (number <= 0) {
            System.out.println("Done!");
            return;
        }
        System.out.println(number);
        countdown(number - 1);
        System.out.println("Returning from the recursive");
    }

    private static void method(int count) {
        if (count == 50) {
            return;
        }
        System.out.println(count);
        method(count + 1);
    }

}
