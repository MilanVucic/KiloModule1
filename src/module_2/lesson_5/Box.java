package module_2.lesson_5;

public class Box<T, U> {
    T value;

    public T getValue(U index) {
        if (value != null) {
            return value;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
