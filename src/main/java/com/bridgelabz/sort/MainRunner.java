package com.bridgelabz.sort;

public class MainRunner {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new QuickSort());
        Thread thread2 = new Thread(new MergeSort());
        thread1.start();
        thread2.start();
    }
}
