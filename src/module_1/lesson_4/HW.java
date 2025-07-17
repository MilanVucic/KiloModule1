package module_1.lesson_4;

public class HW {
    public static void main(String[] args) {
        int a = 100; // 99
        int b = 101; // 102
        int c = 102; // c = 101
        int d = c--; // d = 101
        //            T             || ?????????
        if ((--d <= b && ++b > --a) || (c-- == b)) {
            System.out.println("1");
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
