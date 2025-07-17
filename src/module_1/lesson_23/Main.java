package module_1.lesson_23;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice:");
        System.out.println("1. View highscores");
        System.out.println("2. Enter your score");
        String fileName = "highscores.txt";
        List<PlayerScore> scores = readHighscoresFromFile(fileName);
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1 -> printHighScores(scores);
            case 2 -> {
                PlayerScore score = readPlayerScore(scanner);
                scores.add(score);
                Collections.sort(scores);
            }
            default -> System.out.println("Wrong input.");
        }

        saveScoresToFile(scores, fileName);
    }

    private static void saveScoresToFile(List<PlayerScore> scores, String fileName) {
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(fileName));
            for (PlayerScore score : scores) {
                printWriter.println(score);
            }
            printWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printHighScores(List<PlayerScore> scores) {
        for (int i = 0; i < scores.size(); i++) {
            System.out.println((i + 1) + ". " + scores.get(i));
        }
    }

    private static List<PlayerScore> readHighscoresFromFile(String filename) {
        List<PlayerScore> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();

            while (line != null) {
                // Milan 255
                PlayerScore score = PlayerScore.parseFromString(line);
                list.add(score);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private static PlayerScore readPlayerScore(Scanner scanner) {
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your score:");
        int score = scanner.nextInt();
        return new PlayerScore(name, score);
    }

    private static void readWriteExample() {
        try {
            FileReader fileReader = new FileReader("test.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test2.txt"));
            bufferedWriter.write("asdasd");
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
