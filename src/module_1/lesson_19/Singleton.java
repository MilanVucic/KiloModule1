package module_1.lesson_19;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // ....
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
