package module_1.lesson_15;

public class MyLinkedList<T> {
    private Node<T> head;

    public T get(int index) {
        Node<T> temp = head;
        while (temp != null) {
            temp = temp.next;
        }
        return null;
    }

    public void addFront(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    public void addEnd(T data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node<T> newNode = new Node<>(data);
            current.next = newNode;
        }
    }

    public int length() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    @Override
    public String toString() {
        String result = "[";
        Node<T> current = head;
        while (current != null) {
            result += current.data;
            if (current.next != null) {
                result += " ";
            }
            current = current.next;
        }
        return result + "]";
    }

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }
}
