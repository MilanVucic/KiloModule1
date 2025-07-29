package module_2.lesson_3;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    @Override
    public int compareTo(Person o) {
        if (o.name.length() == this.name.length()) {
            return o.age - this.age;
        }
        return o.name.length() - this.name.length();
    }
}
