package module_1.lesson_12;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Milan", 30);
        Person p2 = new Person("Marco", 34);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1);
        System.out.println(p2);
    }
}
