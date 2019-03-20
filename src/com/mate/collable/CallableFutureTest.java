package com.mate.collable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableFutureTest {
    public static final int NUMBER_OF_ITERATIONS = 5;

    public static void callableFutureTest() {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<Integer>> futures = new ArrayList<>();
        for (int i = 1; i < NUMBER_OF_ITERATIONS; i++) {
            Callable<Integer> callable  = new CallableExample((i + 2)*2);
            Future<Integer> value = executor.submit(callable);
            futures.add(value);
        }
        for (Future<Integer> value : futures) {
            try {
                System.out.println("The value is: " + value.get());
            } catch (InterruptedException | ExecutionException e) {
                System.out.println("Message " + e.getMessage());
            }
        }
        executor.shutdown();
    }

}
