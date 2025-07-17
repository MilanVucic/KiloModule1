package module_1.lesson_8;

public class BasicMethod {
    public static void main(String[] args) {
        int count = 50;
        printHello("Glen", count);
        printHello("Mirna", 10);
    }

    public static void printHello(String name, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("HELLO " + name);
        }
    }
}
