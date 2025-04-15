package lesson_15;

class TheLinkedList<T> {
    private Node<T> head;

    public T get(int index) {
        Node<T> temp = head; //equals the reference to head
        int nodeCounter = 0;

        if (temp == null) {
            System.out.println("Index does not exist");
            return null;
        }

        while (temp != null) {
            if (index == nodeCounter) {
                return temp.data;
            }
            nodeCounter++;
            temp = temp.next;
        }

        throw new IndexOutOfBoundsException("Index: " + index);
    }

    public int size() {
        int nodeCounter = 1;
        Node<T> temp = head;

        if (temp == null) {
            return 0;
        }

        while (temp.next != null) {
            nodeCounter++;
            temp = temp.next;
        }

        return nodeCounter;
    }

    public void addTail(T value) {
        insert(this.size(), value);
    }

    public void addHead(T value) {
        insert(0, value);
    }

    public void insert(int index, T value) {
        Node<T> newNode = new Node<>(value);
        Node<T> temp = head;
        int nodeCounter = 0;

        if (index == 0) {
            newNode.next = temp;
            head = newNode;
            return;
        }

        while (temp != null && nodeCounter < index - 1) { //Get the node where we want to insert our new node
            temp = temp.next;
            nodeCounter++;
        }

        if (temp == null) {
            throw new IndexOutOfBoundsException("Can't insert at index: " + index);
        }

        //Point temp to our new node.
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void printList() {
        Node<T> temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            if (temp.next != null) {
                System.out.print(" --> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    // Create a method to find N-th to the last element in a linked list
    // in a single traversal

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }
}