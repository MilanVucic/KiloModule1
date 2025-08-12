package module_2.lesson_7;

public class ParentClass extends Object{
    private int a = 1;
    private static int b = 500;

    public ParentClass(int a) {
        this.a = a;
    }

    static {
        System.out.println("ParentClass static init block");
        b = 100;
    }

    {
        System.out.println("ParentClass non-static init block");
    }

    public ParentClass() {
        System.out.println("ParentClass constructor");
    }

}
