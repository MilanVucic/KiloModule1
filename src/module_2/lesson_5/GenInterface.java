package module_2.lesson_5;

public class GenInterface<T extends InterExample<T>> {
    void doMyStuff(T elem) {
        elem.returnStuff();
    }
}
