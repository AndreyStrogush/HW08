package com.mate.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinApp {
    protected static final int NAMBER_OF_THREADS = Runtime.getRuntime().availableProcessors();
    private static final long COUNT = 1_000_000_000L;

    public static void forkJointest() {
        ForkJoinPool forkJoinPool = new ForkJoinPool(NAMBER_OF_THREADS);
        System.out.println("Count of threaads is: " + NAMBER_OF_THREADS);
        System.out.println(forkJoinPool.invoke(new SumCount(0, COUNT)));
    }
}
