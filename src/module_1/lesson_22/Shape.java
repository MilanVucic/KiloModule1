package module_1.lesson_22;

public abstract class Shape {
    private String color;
    private int id;

    public Shape(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();
    public abstract double getCircumference();
}
