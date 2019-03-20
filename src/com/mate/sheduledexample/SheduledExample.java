package com.mate.sheduledexample;

import com.mate.collable.CallableExample;

import java.util.concurrent.*;

public class SheduledExample {

    public static void sheduledTest() throws ExecutionException, InterruptedException{
        ScheduledExecutorService ses =
                Executors.newSingleThreadScheduledExecutor();
        ScheduledFuture<Integer> scheduledFuture1 =
                ses.schedule(new CallableExample(4), 3, TimeUnit.SECONDS);
        ScheduledFuture<Integer> scheduledFuture2 =
                ses.schedule(new CallableExample(6), 5, TimeUnit.SECONDS);

        System.out.println("Remaining delay of thread #1: " + scheduledFuture1.getDelay(TimeUnit.SECONDS));
        System.out.println("Remaining delay of thread #2: " + scheduledFuture2.getDelay(TimeUnit.SECONDS));
        System.out.println(scheduledFuture1.get());
        System.out.println(scheduledFuture2.get());

        ses.shutdown();
    }

}
