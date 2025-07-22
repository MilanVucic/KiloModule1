package module_2.lesson_2;

public abstract class AbsExample {
    private int a;
    private double b;

    public AbsExample(int a, double b) {
        this.a = a;
        this.b = b;
    }

    public void normalMethod() {
        System.out.println("YO!");
    }

    public abstract void doStuff();
    public abstract void doStuff2();
    public abstract void doStuff3();
}
