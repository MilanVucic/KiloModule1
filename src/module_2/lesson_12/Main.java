package module_2.lesson_12;

import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    private volatile int b;

    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (a) {
                System.out.println("T1 started using a!");
                synchronized (b) {
                    System.out.println("T1 started using b");
                }
            }
            System.out.println("T1 done");
        });

        Thread t2 = new Thread(() -> {
            synchronized (b) {
                System.out.println("T2 started using b!");
                synchronized (a) {
                    System.out.println("T2 started using a");
                }
            }
            System.out.println("T2 done");
        });

        t1.start();
        t2.start();
        System.out.println("Program done!");
    }

    private static void joinSums() {
        int[] array = generateArray(200000000);
        long start = System.currentTimeMillis();
        long threadResult = sumWithThreads(array);
        long elapsed = System.currentTimeMillis() - start;
        System.out.println("Threads: " +threadResult);
        System.out.println("Time: " + elapsed + " ms");

        long startNoThreads = System.currentTimeMillis();
        long noThreadsResult = sumWithoutThreads(array);
        long elapsedNoThreads = System.currentTimeMillis() - startNoThreads;
        System.out.println("No threads: " + noThreadsResult);
        System.out.println("Time: " + elapsedNoThreads + " ms");
    }

    private static long sumWithoutThreads(int[] array) {
        long res = 0;
        for (int i = 0; i < array.length; i++) {
            res += array[i];
        }
        return res;
    }

    private static long sumWithThreads(int[] array) {
        int numOfThreads = 8;

        ThreadSum[] workerThreads = new ThreadSum[numOfThreads];
        int chunkSize = (int) Math.ceil(1.0 * array.length / numOfThreads);
        for (int i = 0; i < numOfThreads; i++) {
            int start = i * chunkSize;
            int end = (i + 1) * chunkSize;
            workerThreads[i] = new ThreadSum(array, start, end);
            workerThreads[i].start();
        }

        long finalRes = 0;
        for (int i = 0; i < workerThreads.length; i++) {
            try {
                workerThreads[i].join();
                finalRes += workerThreads[i].getResult();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return finalRes;
    }

    private static int[] generateArray(int numOfElements) {
        int[] numbers = new int[numOfElements];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(20);
        }
        return numbers;
    }

    private static void joinExample() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("T1: " + i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("T2: " + i);
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("T3: " + i);
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("T4: " + i);
            }
        });
        Thread t5 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("T5: " + i);
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            System.out.println("Done!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void firstExample() {
        Object lock = new Object();
        int b = 100;
        int c = 1;

        synchronized (lock) {
            int t = b;
            b = c;
            c = t;
        }
        Main m = new Main();
        m.myMethod();
        staticExample();

        synchronized (lock) {
            System.out.println(b);
            System.out.println(c);
        }
    }

    public synchronized void myMethod() {

    }

    public static synchronized void staticExample() {

    }
}
