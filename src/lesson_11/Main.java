package lesson_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.firstName = "Milan";
        student1.lastName = "Vucic";
        student1.grades = new int[]{6,7,7};

        Student student2 = new Student();
        student2.firstName = "Tomasz";
        student2.lastName = "Mildner";
        student2.age = 50;
        student2.grades = new int[]{6,6,9};
        Teacher t = new Teacher();
        t.firstName = "Teacher";
        t.lastName = "Teacherovsky";
        t.subject = "Physics";

        Person p = new Person();
        p.firstName = "Person";
        p.lastName = "Personovsky";
        Person[] people = new Person[4];
        people[0] = student1;
        people[1] = student2;
        people[2] = t;
        people[3] = p;
        for (Person person : people) {
            person.printMe();
        }
    }
}
