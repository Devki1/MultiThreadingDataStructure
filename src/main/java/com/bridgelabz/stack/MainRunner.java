package com.bridgelabz.stack;

public class MainRunner {
    public static void main(String[] args) {
        Thread thread = new Thread(new Stack());
        thread.start();
    }
}

