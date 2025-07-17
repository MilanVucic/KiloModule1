package module_1.lesson_3;

public class Part7 {
    public static void main(String[] args) {
        boolean a = true;
        int b = 10;
        // Lazy eval
        // if TRUE OR ???
        if (a || b++ < 12) {
            System.out.println("1");
        }
        System.out.println(b);

        // if FALSE AND ???
        if (!a && --b < 10) {
            System.out.println("2");
        }
        System.out.println(b);

        // if TRUE AND ???
        if (a && --b < 10) {
            System.out.println("3");
        }
        System.out.println(b);
        byte abc = 4 | 1; // 100 | 001 -> 101 -> 5
        System.out.println(abc);
        int abc1 = 5 & 7; // 101 & 111 -> 101
        System.out.println(abc1);
    }
}
