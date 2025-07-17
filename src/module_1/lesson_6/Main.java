package module_1.lesson_6;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[4];
        // 0 1 2 3 - indexes
        // 5 0 3 15
        a[0] = 5;
        a[2] = 3;
        a[3] = a[0] * a[2];

        String[] names = new String[3];
        // null null null
        names[0] = "Milan";
        names[1] = "Mirna";
        names[2] = "Anna";

        String[] namesWithFastInit = {"Milan", "Mirna", "Anna"};
        System.out.println(a[1]);
        System.out.println(names[0]);

        // length = 4, i - 0,1,2,3
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        int index = 0;
        while (index < a.length) {
            System.out.println(a[index++]);
        }
    }
}
