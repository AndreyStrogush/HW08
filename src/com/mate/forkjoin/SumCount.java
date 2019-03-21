package com.mate.forkjoin;

import java.util.concurrent.RecursiveTask;

import static com.mate.forkjoin.ForkJoinApp.NAMBER_OF_THREADS;

public class SumCount extends RecursiveTask<Long> {
    private long from;
    private long to;

    public SumCount(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long compute() {
        if ((to - from) <= (to / NAMBER_OF_THREADS)) {
            long result = 1;
            for (long i = from; i < to; i++) {
                result++;
            }
            return result;
        } else {
            long middle = (to + from)/2;
            SumCount first = new SumCount(from, middle);
            first.fork();
            SumCount second = new SumCount(middle + 1, to);
            long secondValue = second.compute();
            return first.join() + secondValue;
        }
    }
}
