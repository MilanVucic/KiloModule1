package module_2.lesson_7;

public class ChildClass extends ParentClass implements SomeInt {
    public ChildClass(int a) {
        super(a);
    }

    static {
        System.out.println("ChildClass static init block");
    }

    {
        System.out.println("ChildClass non-static init block");
    }

    public ChildClass() {
        System.out.println("ChildClass constructor");
    }

    @Override
    public int hashCode() {
        return 5;
    }

}
