package module_1.lesson_15;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.addEnd(15);
        myLinkedList.addFront(5);
        myLinkedList.addFront(10);
        myLinkedList.addFront(13);
        myLinkedList.addEnd(25);
        System.out.println(myLinkedList);
    }

    private static void arrayListPractice() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(1, 10);
        arrayList.remove(0);
        System.out.println(arrayList);
        System.out.println(arrayList.contains(1));
        System.out.println(arrayList.contains(15));

        ArrayList<ArrayList<String>> arrayLists = new ArrayList<>();
        ArrayList<String> e = new ArrayList<>();
        e.add("milan");
        arrayLists.add(e);
        ArrayList<String> e2 = new ArrayList<>();
        e2.add("glen");
        e2.add("tomasz");
        arrayLists.add(e2);
        System.out.println(arrayLists);
    }

    private static void usingMyArray() {
        MyArray<Integer> myArray = new MyArray<>();
        myArray.add(50);
        myArray.add(3);
        myArray.add(2);
        myArray.add(6);
        myArray.add(91);
        myArray.add(91);
        myArray.add(91);
        myArray.add(91);
        myArray.add(91);
        System.out.println(myArray);
        MyArray<String> names = new MyArray<>();
        names.add("asdasdsd");
        names.add("Milan");
        names.add("Vucic");
        names.add("asdnjaskhjd");
    }
}
