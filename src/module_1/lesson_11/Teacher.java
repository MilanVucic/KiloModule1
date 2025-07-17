package module_1.lesson_11;

public class Teacher extends Person{
    String subject;
    int yearsOfExperience;

    void printMe() {
        System.out.println(firstName + " " + lastName + " " + subject);
    }
}
