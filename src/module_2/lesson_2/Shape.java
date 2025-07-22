package module_2.lesson_2;

public abstract class Shape {
    private static int NEXT_ID = 1;

    private int id;
    private String color; // RGB (#a2344b)

    public Shape(String color) {
        this.id = NEXT_ID++;
        this.color = color;
    }

    public abstract double getArea();
    public abstract double getCircumference();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id + " " + color
                + "\nArea: " + getArea() + ", Circumference: " + getCircumference();
    }
}
