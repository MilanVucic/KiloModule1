package module_2.lesson_11;

public class MyCustomThread extends Thread{
    @Override
    public void run() {
        System.out.println("Hello from my custom thread");
    }
}
