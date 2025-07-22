package module_2.lesson_2;

public class Circle extends Shape {
    private double radius;
    private double x, y;

    public Circle(String color, double radius, double x, double y) {
        super(color);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getCircumference() {
        return radius * 2 * Math.PI;
    }
}
