package module_2.lesson_3;

public class ClassExample implements InterfaceExample, AnotherInterface, Comparable<Integer>{
    @Override
    public void method(int a, double b) {

    }

    @Override
    public boolean hasStuff() {
        return false;
    }

    @Override
    public void anotherMethod(String stuff) {

    }

    @Override
    public int compareTo(Integer o) {
        return 0;
    }

}
