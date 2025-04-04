package lesson_14;

public class Circle {
    private double radius;
    private Point2D center;

    public Circle(double radius, Point2D center) {
        this.radius = radius;
        this.center = center;
    }

    public Circle(double radius) {
        this(radius, new Point2D());
    }

    public Circle() {
        this(1);
    }

    public Circle(double radius, double x, double y) {
        this(radius, new Point2D(x, y));
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    public boolean contains(Point2D point2D) {
        double distance = center.distanceTo(point2D);
        return distance <= radius;
    }

    // TODO
    public boolean contains(Circle other) {
        return false;
    }

    // TODO
    public boolean intersects(Circle other) {
        return false;
    }
}
