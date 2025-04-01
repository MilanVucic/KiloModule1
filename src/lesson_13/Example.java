package lesson_13;

public class Example {
    int a = 50;
    int d;
    static double b = 1.55;
    static double c = 1.55;

    public Example() {

    }

    public void nonStatic() {
        staticMethod();
        a = 500;
        b = 500;
    }

    public static void printValue() {
        System.out.println(b);
        staticMethod();
    }

    public static void staticMethod() {

    }
}
