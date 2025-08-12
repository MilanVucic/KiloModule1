package module_2.lesson_7;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ChildClass c = new ChildClass(5);
        ChildClass d = new ChildClass(120);
        System.out.println(c.equals(d));
        System.out.println(c.hashCode());
        System.out.println(c.getClass().getName());
        Class<ChildClass> clazz = ChildClass.class;

        String a = "abc"; // a -> abcdef
        a += "def";
        String b = a.toLowerCase(); // ABCDEF

        Set<ChildClass> set = new HashSet<>();
        set.add(c);
        set.add(d);
        System.out.println(set.size());
    }

    private static void instanceOfExamples() {
        ParentClass p = new ParentClass();
        ParentClass c = new ChildClass(); // Child = Lion, Parent = Animal
        Object o = new ChildClass();
        System.out.println(c instanceof ParentClass); // true
        System.out.println(p instanceof ChildClass); // false
        System.out.println(c instanceof ChildClass); // true
        System.out.println();
        System.out.println(o instanceof Object); // true
        System.out.println(o instanceof ParentClass); // true
        System.out.println(o instanceof ChildClass); // true
        System.out.println(o instanceof SomeInt); // true

        System.out.println(p instanceof SomeInt); // false

        ChildClass c1 = new ChildClass();
        ParentClass p1 = c1; // Animal a = dog;
        ChildClass c2 = (ChildClass) p1; // Lion l = a;

        int choice = 2;

        String message = switch (choice) {
            case 0 -> {
                System.out.println("....");
                yield "Not done";
            }
            case 1 -> "Started";
            case 2 -> "Tested";
            default -> "Done";
        };
    }
}
