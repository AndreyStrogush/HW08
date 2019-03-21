package com.mate.sheduledexample;

import com.mate.collable.CallableExample;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class SheduledExample {

    public static void sheduledTest() throws ExecutionException, InterruptedException{
        ScheduledExecutorService ses =
                Executors.newSingleThreadScheduledExecutor();
        ScheduledFuture<Integer> firstFuture =
                ses.schedule(new CallableExample(4), 3, TimeUnit.SECONDS);
        ScheduledFuture<Integer> secondFuture =
                ses.schedule(new CallableExample(6), 5, TimeUnit.SECONDS);
        System.out.println("Remaining delay of thread #1: " + firstFuture.getDelay(TimeUnit.SECONDS));
        System.out.println("Remaining delay of thread #2: " + secondFuture.getDelay(TimeUnit.SECONDS));
        System.out.println(firstFuture.get());
        System.out.println(secondFuture.get());
        ses.shutdown();
    }
}
