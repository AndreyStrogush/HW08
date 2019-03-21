package com.mate;

import com.mate.collable.CallableFutureTest;
import com.mate.executorservice.ExecutorExample;
import com.mate.forkjoin.ForkJoinApp;
import com.mate.sheduledexample.SheduledExample;
import com.mate.threadpool.ThreadPoolExample;

public class ConsoleApplication {

    public static void main(String[] args) throws Exception {
        ForkJoinApp.forkJointest();
        CallableFutureTest.callableFutureTest();
        SheduledExample.sheduledTest();
        ThreadPoolExample.threadPoolTest();
        ExecutorExample.executorTest();
    }
}
