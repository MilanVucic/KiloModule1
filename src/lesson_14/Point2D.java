package lesson_14;

public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        this(0, 0);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceTo(Point2D other) {
        return distance(this, other);
    }

    public static double distance(Point2D p1, Point2D p2) {
        return Math.hypot(p1.x - p2.x, p1.y - p2.y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
