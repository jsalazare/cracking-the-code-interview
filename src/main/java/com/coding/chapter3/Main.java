package com.coding.chapter3;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.toString());
        System.out.println(stack.pop());
        System.out.println(stack.toString());
        stack.push(10);
        System.out.println(stack.toString());

    }
}
