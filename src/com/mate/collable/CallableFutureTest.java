package com.mate.collable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableFutureTest {

    public static void callableFutureTest() {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<Integer>> futures = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            Callable<Integer> callable  = new CallableExample((i + 2)*2);
            Future<Integer> value = executor.submit(callable);
            futures.add(value);
        }
        for (Future<Integer> value : futures) {
            try {
                System.out.println("The value is: " + value.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }

}
