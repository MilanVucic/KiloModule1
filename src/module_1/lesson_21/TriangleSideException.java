package module_1.lesson_21;

public class TriangleSideException extends RuntimeException {
    private double a, b, c;

    public TriangleSideException(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String getMessage() {
        return "Triangle with sides " + a + ", " + b + ", " + c + " cannot exist.";
    }
}
