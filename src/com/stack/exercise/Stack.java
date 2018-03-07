package com.stack.exercise;

public class Stack<X> {
    private X [] data;
    private int stackPointer;


    public Stack() {
        this.data = (X[]) new Object[1000];
        this.stackPointer = 0;
    }


    public void push(X newItem){data[stackPointer++] = newItem};




}
