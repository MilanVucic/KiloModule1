package lesson_4;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 2) {
                continue;
            }
            System.out.println(i);
            // 0 1 3 4 6 7 9
        }
    }
}
