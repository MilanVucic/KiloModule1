package module_1.lesson_14;

public class Main {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(3,4);
        Point2D p2 = new Point2D(0, 0);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.distanceTo(p2));
        System.out.println(p2.distanceTo(new Point2D(6,8)));
        System.out.println(Point2D.distance(p1, p2));
    }
}
