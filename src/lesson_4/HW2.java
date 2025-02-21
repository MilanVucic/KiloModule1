package lesson_4;

public class HW2 {
    public static void main(String[] args) {
        int a = 100; // 100
        int b = 101; // 102
        boolean c = ++a >= b; // true
        int d = 102; // 101
        //      F   ||  T
        if (d-- < b || ++b > --a) {
            System.out.println("1");
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
