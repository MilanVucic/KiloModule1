package module_1.lesson_23;

public class PlayerScore implements Comparable<PlayerScore>{
    private String name;
    private int score;

    public PlayerScore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public static PlayerScore parseFromString(String line) {
        String[] parts = line.split(" ");
        // "Ana Maria-500"
        return new PlayerScore(parts[0], Integer.parseInt(parts[1]));
    }

    @Override
    public String toString() {
        return name + " " + score;
    }

    @Override
    public int compareTo(PlayerScore o) {
        return o.score - this.score;
    }
}
