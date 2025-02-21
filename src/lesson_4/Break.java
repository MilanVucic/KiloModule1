package lesson_4;

public class Break {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 25) {
            counter++;
            System.out.println(counter);
            if (counter == 2) {
                break;
            }
        }

        System.out.println("------");

        for (int i = 1; i < 20; i++) {
            System.out.println(i);
            if (i % 5 == 0) {
                break;
            }
        }
        // 1 2 3 4 5
    }
}
