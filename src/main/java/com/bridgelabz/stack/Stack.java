package com.bridgelabz.stack;

import java.util.Arrays;

public class Stack implements Runnable {
    private Object obj[];
    private int capacity;
    private int top;

    public Stack(int capacity) {
        this.capacity = capacity;
        obj = new Object[capacity];
        top = -1;
    }

    public Stack() {
    }

    //Inserting elements from top of the stack
    public boolean push(Object data) {
        if (top == capacity - 1) {
            return false;
        }
        obj[++top] = data;
        return true;
    }

    @Override
    public String toString() {
        String st = "[";
        for (int i = 0; i <= top; i++) {
            st = st + obj[i];
            if (i < top) {
                st = st + ",";
            }
        }
        return st + "]";
    }

    //Removing elements from top of the stack
    public Object pop() {
        return obj[top--];
    }

    public void print() {
        Arrays.stream(obj)
                .forEach(e -> System.out.print(e + " "));
    }

    @Override
    public void run() {
        Stack stack = new Stack(5);
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.pop();
        System.out.println(stack);
    }
}

