package module_2.lesson_3;

public class ConsoleInfoDisplayer implements InfoDisplayer {
    @Override
    public void onMessage(String message, MessageType messageType) {
        System.out.println(message);
    }
}
