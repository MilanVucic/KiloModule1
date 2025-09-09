package module_2.lesson_12;

public class ThreadSum extends Thread {
    private int[] numbers;
    private int start;
    private int end;

    private long result = 0;

    public ThreadSum(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            result += numbers[i];
        }
    }

    public long getResult() {
        return result;
    }
}
