package module_2.lesson_16;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    private transient String address;
    //    private Address address;
    // []

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " " + age + " ADDRESS: " + address;
    }
}
