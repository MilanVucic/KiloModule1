package lesson_3;

public class Part5 {
    public static void main(String[] args) {
        int age = 7;
        String message;
        if (age > 18) {
            message = "Welcome, you can enter.";
        } else {
            message = "You cannot enter.";
        }

        String altMessage = (age > 18) ? "Welcome, you can enter.": "You cannot enter.";
        System.out.println(message);
        System.out.println(altMessage);
    }
}
