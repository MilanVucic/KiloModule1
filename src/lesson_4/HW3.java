package lesson_4;

public class HW3 {
    public static void main(String[] args) {
        int result = 5;
        int a = 1; // 0
        int b = --a; // 1
        a++; //
        result += a + (--a / ++b); // 1 + 0
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(result);
    }
}
