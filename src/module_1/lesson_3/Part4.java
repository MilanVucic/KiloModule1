package module_1.lesson_3;

public class Part4 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        int c = 10;
        int d = 11;
        if (a && !b) {
            System.out.println("1");
        }

        if (d > c++) {
            System.out.println("2");
        }
        int e = ++d;
        int f = d++;
        System.out.println(e);
        System.out.println(f);
    }
}
