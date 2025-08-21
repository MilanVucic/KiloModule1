package module_2.lesson_11;

public class Main {
    public static void main(String[] args) {
        CountdownTimer countdownTimer = new CountdownTimer(6, new TimerCallback() {
            @Override
            public void onTick(int timeRemaining) {
                System.out.println(timeRemaining);
            }

            @Override
            public void onFinished() {
                System.out.println("DONEZO");
            }
        });
        CountdownTimer countdownTimer2 = new CountdownTimer(8, new TimerCallback() {
            @Override
            public void onTick(int timeRemaining) {
                System.out.println("Time: " + timeRemaining);
            }

            @Override
            public void onFinished() {
                System.out.println("Done!");
            }
        });
        countdownTimer.start();
        countdownTimer2.start();
    }

    private static void example2() {
        Thread t1 = new Thread(() -> {
            System.out.println("Hello");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("From the other side");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("T2222");
            System.out.println("123");
            System.out.println("xxx");
            System.out.println("T2222");
            System.out.println("T2222");
            System.out.println("123");
            System.out.println("xxx");
        });
        t1.start();
        t2.start();
    }

    private static void firstExample() {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("T1: " + i);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("T2: " + i);
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("T3: " + i);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        new MyCustomThread().start();
    }
}
