package lesson_15;

public class MyLinkedList<T> {
    private Node<T> head;

    public T get(int index) {
        Node<T> temp = head;
        while (temp != null) {
            temp = temp.next;
        }
        return null;
    }

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }
}
