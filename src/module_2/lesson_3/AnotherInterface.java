package module_2.lesson_3;

public interface AnotherInterface {
    void anotherMethod(String stuff);
    default void doSomeStuff() {
        System.out.println("...");
    }
}
