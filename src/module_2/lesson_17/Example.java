package module_2.lesson_17;

public class Example {
    private int a;
    protected static volatile transient double b;
    static final String c = "asd";
    public String d;

    public Example(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    private void doStuff() {
        System.out.println("Doing stuff!");
    }

    private void doStuff(double a, String something) {
        System.out.println("Doing stuff!" + a + " this.a = " + this.a);
        System.out.println(something);
    }
}
