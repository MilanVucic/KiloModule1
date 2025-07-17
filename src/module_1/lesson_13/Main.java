package module_1.lesson_13;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Audi", "A5", 2012);
        Vehicle v2 = new Vehicle("BMW", "320d", 2006);
        Vehicle v3 = new Vehicle("Toyota", "Corolla", 2024);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }

    private static void innerExamples() {
        OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerNonStaticClass innerNonStaticClass = outerClass.new InnerNonStaticClass();
    }

    private static void randomStuff() {
        Example example = new Example();
        example.a = 500;
        Example example2 = new Example();
        example2.a = 501;
        System.out.println(example2.a);
        System.out.println(example.a);
        example.staticMethod();
        Example.staticMethod();
        example2.staticMethod();
    }


    public static void doStuff() {

    }
}
