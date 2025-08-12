package module_2.lesson_6;

public class BuilderPattern {
    private int a;
    private String b;
    private double c;

    public BuilderPattern setA(int a) {
        this.a = a;
        return this;
    }

    public BuilderPattern setB(String b) {
        this.b = b;
        return this;
    }

    public BuilderPattern setC(double c) {
        this.c = c;
        return this;
    }
}
