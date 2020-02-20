package com.coding.chapter3.two;

public class Main {
    public static void main(String[] args) {
        MinStack<Integer> stack = new MinStack<>();
        stack.push(10);
        stack.push(3);
        stack.push(12);
        stack.push(5);

        System.out.println(stack.getMin());
    }
}
