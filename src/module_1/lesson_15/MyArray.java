package module_1.lesson_15;

public class MyArray<T> {
    public static final int INITIAL_CAPACITY = 10;
    public static final int GROWTH_FACTOR = 2;

    //  0 1 2 3
    // elements: [1,2,3,4]
    // temp -> [1,2,3,4,5,x,x,x]

    private T[] elements;
    private int size;

    public MyArray(int initialCapacity) {
        elements = (T[]) new Object[initialCapacity];
        size = 0;
    }

    public MyArray() {
        this(INITIAL_CAPACITY);
    }

    // array[5]
    // myArray.get(5)
    public T get(int index) {
        checkIndexBounds(index);
        return elements[index];
    }

    public void add(T elem) {
        if (size < elements.length) {
            elements[size++] = elem;
        } else {
            T[] temp = (T[]) new Object[elements.length * GROWTH_FACTOR];
            for (int i = 0; i < elements.length; i++) {
                temp[i] = elements[i];
            }
            temp[size++] = elem;
            elements = temp;
        }
    }

    public void add(int index, T elem) {
        // TODO implement me!
    }

    public void remove(int index) {
        // TODO
    }

    // array[5] = 23;
    public void set(int index, T value) {
        checkIndexBounds(index);
        elements[index] = value;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String output = "[";
        for (int i = 0; i < size(); i++) {
            output += get(i);
            if (i != size() - 1) {
                output += ", ";
            }
        }
        output += "]";
        return output;
    }

    private void checkIndexBounds(int index) {
        if (index < 0 || index >= size) {
            // It should throw an exception instead of this
            System.out.println("Wrong index");
        }
    }

}
