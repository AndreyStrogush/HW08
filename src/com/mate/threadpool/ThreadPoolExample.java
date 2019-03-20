package com.mate.threadpool;

import com.mate.collable.CallableExample;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolExample {
    private static final int NUMBER_OF_THREADS = 2;
    private static final int VALUE_FOR_MULTIPLY = 6;

    public static void threadPoolTest()throws ExecutionException, InterruptedException{
        ExecutorService service = Executors.newFixedThreadPool(NUMBER_OF_THREADS);
        Future<Integer> future = service.submit(new CallableExample(VALUE_FOR_MULTIPLY));
        System.out.println(future.get());
        service.shutdown();
    }

}
