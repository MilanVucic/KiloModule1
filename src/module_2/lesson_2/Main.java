package module_2.lesson_2;

public class Main {
    public static void main(String[] args) {
        // Animal a = new Tiger();
        AbsExample a = new ChildAnotherClass();
        AbsExample b = new SimpleExample(4, 5);

        // Anonymous class example
        AbsExample c = new AbsExample(5, 6) {

            @Override
            public void doStuff() {

            }

            @Override
            public void doStuff2() {

            }

            @Override
            public void doStuff3() {

            }
        };

        Shape[] shapes = new Shape[]{new Circle("#a11b3f", 5, 2, 3),
                new Rectangle("#123123", 5, 6)};

        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        print(5);
        print(5.5);
        doShapeStuff(new Circle("asd", 23.5,3.4,5));
        doShapeStuff(new Rectangle("asd", 3.4,5));
    }

    private static void doShapeStuff(Shape s) {

    }

    private static void doShapeStuff(Circle c) {

    }

    private static void print(double b) {
        System.out.println("DOUBLE");
        System.out.println(b);
    }

    private static void print(int a) {
        System.out.println("INTEGER");
        System.out.println(a);
    }
}
