package module_2.lesson_16;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class Main {
    public static void main(String[] args) {

    }

    private static void readSerialized() {
        try {
            FileInputStream fout = new FileInputStream("test.txt");
            ObjectInputStream oos = new ObjectInputStream(fout);
            Person p = (Person) oos.readObject();
            System.out.println(p);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void saveSerialized() {
        Person p1 = new Person("Milan", 31, "Some cool street 123");

        try {
            FileOutputStream fout = new FileOutputStream("test.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(p1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
