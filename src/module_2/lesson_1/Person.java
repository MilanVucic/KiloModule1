package module_2.lesson_1;

public class Person {
    private int age;

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("!!!");
        }
        this.age = age;
    }
}
