package module_2.lesson_13;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ThreadLocal<Integer> someVar = ThreadLocal.withInitial(() -> 5);

        Thread t1 = new Thread(() -> {
           someVar.set(500);
            System.out.println("T1 someVar = " + someVar.get());
        });
        Thread t2 = new Thread(() -> {
            System.out.println("T2 someVar = " + someVar.get());
            someVar.set(300);
            System.out.println("T2 someVar = " + someVar.get());
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(someVar.get());

        OuterClass outerClass = new OuterClass(55);
        OuterClass outerClass2 = new OuterClass(33);
        OuterClass.NormalInnerClass example = outerClass2.new NormalInnerClass();
        example.someMethod();
    }

    private static void executors() {
        ExecutorService es = Executors.newCachedThreadPool(new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread();
                thread.setPriority(5);
                return thread;
            }
        });
        es = Executors.newCachedThreadPool();
    }

    private static void scheduled() {
//        try (ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor()) {
//            Callable<String> job = () -> "Milan";
////            ScheduledFuture<String> result = scheduledExecutorService.schedule(job, 5, TimeUnit.SECONDS);
////            System.out.println(result.get(3, TimeUnit.SECONDS));
//        } catch (ExecutionException | InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (TimeoutException e) {
//            System.out.println("Time ran out");
//        }
    }

    private static void execService() {
        try (
        ExecutorService executorService = Executors.newSingleThreadExecutor();) {
            Callable<Integer> callable = () -> {
                int sum = 0;
                for (int i = 0; i < 1000; i++) {
                    sum += i;
                }
                return sum;
            };

            Future<Integer> future = executorService.submit(callable);
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
            executorService.shutdown();
        }
    }

    private static void priorities() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("T1: " + i);
            }
        });
        t1.setPriority(Thread.MIN_PRIORITY);
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("T2: " + i);
            }
        });
        t2.setPriority(Thread.MAX_PRIORITY);
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("T3: " + i);
            }
        });
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
