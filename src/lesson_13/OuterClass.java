package lesson_13;

public class OuterClass {
    int a;
    private static double b;

    public static class InnerStaticClass {
        public static void doStuff() {
            OuterClass.b = 500;
        }
    }

    public class InnerNonStaticClass {
        public void doStuff() {
            a = 500;
        }
    }
}
