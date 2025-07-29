package module_2.lesson_3;

import java.awt.*;

public class UiInfoDisplayer implements InfoDisplayer{
    @Override
    public void onMessage(String message, MessageType messageType) {
        TextField textField = new TextField(message);
    }
}
