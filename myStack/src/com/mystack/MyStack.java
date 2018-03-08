package com.mystack;

import java.util.Arrays;

public class MyStack<X> {


    //the size should be given in the constructor (no default constructor allowed)

    private X [] items;
    private int index;
    private int size;

    public MyStack(int size) {
        this.size = size;
        this.items = (X[]) new Object[this.size];
    }


    //push functionality (when I add an item to the stack)
   // throw an exception when the stack is full and I want to add one more item
    public void push(X newItem){
        if(index >= size){
            throw new IndexOutOfBoundsException("Full stack");
        } else {
            items[index++] = newItem;
        }
    }

    // pop functionality (when I remove an item)
    // throw an exception when the stack is empty and I want to pop an item
    public X pop(){
        if(index == 0){
            throw new IllegalArgumentException("Empty stack");
        }
        items[index-1] = null;
        return items[--index];
    }

    // peek functionality (I can receive the top item without removing it from the stack, so it's peeking)
    public X peek(){
        if(index <= size) {
            return items[index - 1];
        }
        return null;
    }

    // I want to be able to get the size of the stack (I mean the maximum capacity)
    public int getSize(){
        return index;
    }

    // And write me a method which gives back the number of free spaces left
    public int getFreeSpacesLeft(){
        return size - index;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "items=" + Arrays.toString(items) +
                ", index=" + index +
                ", size=" + size +
                '}';
    }
}
