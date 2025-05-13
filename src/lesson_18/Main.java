package lesson_18;

import java.util.Stack;

public class Main {

    // HW
    // 1. Remove pairs of adjacent letters - afghhgfdds -> afggfs -> affs -> as
    // xaabbccddx -> xx -> ""
    // 2. Check if the brackets are properly paired in a given String
    // Brackets: [], {}, ()
    // [()] - True
    // []((){}) -> True
    // ]([) -> False
    // [(])
    // [([)]]
    //

    // [](([]){})
    // (())]
    // {{{{{{{{
    // ((
    // Stack: ))

    // Move thru the input
    // If it's a left bracket, put on stack
    // If it's a right, see the top of the stack ->
    // if there's nothing, RETURN false
    // if there is, see if it's the proper opener for this closer
    // if not, RETURN false
    // if yes, remove 1 char from the stack, move on
    // At the end, return true if stack is empty, false otherwise
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        // LIFO
        names.push("Milan");
        names.push("Glen");
        names.push("Elena");

        method1();
    }

    private static void method1() {
        System.out.println("Begin! 1");
        method2();
        System.out.println("End! 1");
    }

    private static void method2() {
        System.out.println("Begin! 2");
        method3();
        method4();
        System.out.println("End! 2");
    }

    private static void method3() {
        System.out.println("Begin! 3");
        System.out.println("End! 3");
    }

    private static void method4() {
        System.out.println("4");
    }
}
