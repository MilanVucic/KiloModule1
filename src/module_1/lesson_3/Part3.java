package module_1.lesson_3;

public class Part3 {
    public static void main(String[] args) {
        int age = 28;
        // 0-18 + 65+

        //    25 <= 18 OR 25 >= 65 -> F OR F -> F
        //    9 <= 18 OR 9 >= 65 -> T OR F -> T
        if (age <= 18 || age >= 65) {
            System.out.println("You are eligible for a single  payment.");
        }
        // T OR T -> T
        // T OR F -> T
        // F OR T -> T
        // F OR F -> F
    }
}
