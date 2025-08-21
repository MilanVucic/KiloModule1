package module_2.lesson_11;

public class CountdownTimer extends Thread{
    private int timeRemaining;
    // HW: add tickInterval
    private TimerCallback timerCallback;

    public CountdownTimer(int timeRemaining, TimerCallback timerCallback) {
        this.timeRemaining = timeRemaining;
        this.timerCallback = timerCallback;
    }

    @Override
    public void run() {
        while (timeRemaining > 0) {
            timerCallback.onTick(timeRemaining);
            timeRemaining--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        timerCallback.onFinished();
    }
}