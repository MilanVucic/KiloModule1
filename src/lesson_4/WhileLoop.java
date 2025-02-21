package lesson_4;

public class WhileLoop {
    public static void main(String[] args) {
        int counter = 50;
        while (counter > 1) {
            System.out.println(counter);
            counter -= 22;
        }
        System.out.println("c = " + counter);
        // 50
        // 28
        // 6
        // c = -16
    }
}
