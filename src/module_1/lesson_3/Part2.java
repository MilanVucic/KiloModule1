package module_1.lesson_3;

public class Part2 {
    public static void main(String[] args) {
        boolean isBlue = true;
        int age = 28;
        boolean isUnderage = age <= 18;
        //    95 >= 25 AND 95 <= 35 -> T AND F -> F
        //    20 >= 25 AND 20 <= 35 -> F AND T -> F
        if (age >= 25 && age < 35) {
            System.out.println("You are eligible for bank loan with no interest.");
        }
        // T AND T -> T
        // T AND F -> F
        // F AND T -> F
        // F AND F -> F
    }
}
