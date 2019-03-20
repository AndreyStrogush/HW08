package com.mate.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    private static final int NUMBERS_OF_THREADS = 2;
    private static final int COUNT_OF_ITERATIONS = 4;

    public static void executorTest() {
        ExecutorService service = Executors.newFixedThreadPool(NUMBERS_OF_THREADS);
        for (int i = 0; i < COUNT_OF_ITERATIONS; i++) {
            service.execute(new Work("Thread #" + i, i));
        }

        service.shutdown();
        System.out.println("Finished all threads");
    }

}
