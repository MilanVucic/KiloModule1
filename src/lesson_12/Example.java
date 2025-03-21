package lesson_12;

public class Example {
    int a = 3;
    double b = a * 2;
    int c = a;

    public Example(int a, double b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Example(int a, double b) {
        this(a, b, 50);
    }

    public Example() {
        this(1, 2, 3);
    }
}
