package module_1.lesson_21;

import java.io.Closeable;
import java.io.IOException;

public class CloseableEx implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Closing...");
    }
}
