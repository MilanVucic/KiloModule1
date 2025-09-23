package module_2.lesson_13;

public class OuterClass {
    private int a;
    private static int b;

    public OuterClass(int a) {
        this.a = a;
    }

    public static class StaticInnerClass {
        void someMethod() {
            System.out.println(b);
        }
    }

    public class NormalInnerClass {
        private int a;

        void someMethod() {
            System.out.println(OuterClass.this.a);
            System.out.println(b);
        }
    }
}
