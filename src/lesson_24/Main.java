package lesson_24;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {

    /*
        HW:

        Write a program which will help manage a rent-a-car company
        We need to be able to add cars to our fleet
        We need to be able to rent them, keep track of which ones are free,
        which ones are rented
        We need to maintain the state of the program when exiting,
        and restore that state when starting again
        Use files...
        Make reasonable assumptions where needed.

        0. Add new car
        1. List all cars
        2. List rented cars
        3. List free cars
        4. Pick a car to rent
        5. Return a car from renting
        6. ... Keep track of all "rents", car, start/end date, total cost, etc.
     */
    public static void main(String[] args) throws IOException {
        example("milan");
        example("asd");
        example("asd", "asdjajsd");
        example("asd", "asdjajsd", "anjsdjdj");
        String.format("Hello %s, %d", "Milan", 23);
    }

    private static void example(String name, String... data) {
        System.out.println("-----");
        System.out.println(data.length);
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        System.out.println("-----");
    }

    private static void listAllDir() throws IOException {
        Path path = Path.of("c:\\Users\\vucic");
        try (DirectoryStream<Path> files = Files.newDirectoryStream(path)) {
            for (Path p : files) {
                System.out.println(p);
            }
        }
    }

    private static void nioFileWriting() {
        Path path = Path.of("test.txt");
        try {
            Files.writeString(path, "\nsomething", StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void nioFileReading() {
        Path path = Path.of("highscores.txt");
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
