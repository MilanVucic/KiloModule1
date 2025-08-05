package module_2.lesson_5;

public class GenericEx<T extends SomeClass> {

    public void doStuff(T variable) {
        variable.getA();
        variable.calculate();
    }
}
