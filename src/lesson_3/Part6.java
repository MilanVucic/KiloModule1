package lesson_3;

public class Part6 {
    public static void main(String[] args) {
        String a = "ab"; // a -> 900 -> ab
        String b = "cd"; // b -> 500 -> cd
        String c = "abcd"; // c -> 1600 -> abcd
        String d = "abcd"; // d -> 1600 -> abcd
        String e = a + b; // e -> 2100 -> abcd
        System.out.println(a + b == c);
        System.out.println(c == "abcd");
        System.out.println(a + b == "abcd");
        System.out.println(c == d);
        System.out.println(c == e);

        System.out.println("_____________________");
        System.out.println(c.equals(d));
        System.out.println(c.equals(e));
        System.out.println((a+b).equalsIgnoreCase(c));
    }
}
