package com.mystack;

public class Main {
    public static void main(String[] args) {

        MyStack myStack = new MyStack(10);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
        myStack.push(9);
        myStack.push(10);
        myStack.pop();
        myStack.peek();


        System.out.println(myStack);
        System.out.println(myStack.peek());
        System.out.println(myStack.getSize());
        System.out.println(myStack.getFreeSpacesLeft());

    }
}
