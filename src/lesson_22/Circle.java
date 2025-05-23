package lesson_22;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        super(1);
        this.radius = radius;
    }

    public Circle() {
        this(0);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getCircumference() {
        return 0;
    }
}
