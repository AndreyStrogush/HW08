package com.mate.executorservice;

public class Work implements Runnable {
    private String name;
    private int value;

    public Work(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public void run() {
        System.out.println(name + " starting work");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Message " + e.getMessage());
        }
        System.out.println("Value is " + value);
        System.out.println(name + " finished work");
    }
}
