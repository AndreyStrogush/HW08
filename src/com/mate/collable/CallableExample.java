package com.mate.collable;

import java.util.concurrent.Callable;

public class CallableExample implements Callable<Integer> {
    private int number;

    public CallableExample(int number) {
        this.number = number;
    }

    @Override
    public Integer call() {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

}
