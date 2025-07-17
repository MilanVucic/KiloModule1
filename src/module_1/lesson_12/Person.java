package module_1.lesson_12;

public class Person{
    String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Wrong age. Setting age to 0");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person other = (Person) obj;
            return this.name.equals(other.name) && this.age == other.age;
        }
        return false;
    }

    public String toString() {
        return "Name:" + name + " Age: " + getAge();
    }
}
