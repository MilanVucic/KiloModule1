package module_1.lesson_21;

public class Triangle {
    private double a, b, c;

    // 1 2 3
    public Triangle(double a, double b, double c) {
        if (a + b >= c || a + c >= b || b + c >= a) {
            throw new TriangleSideException(a, b, c);
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
