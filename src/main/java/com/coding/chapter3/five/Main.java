package com.coding.chapter3.five;

public class Main {
    public static void main(String[] args) {
        SortStack stack = new SortStack();

        stack.push(10);
        stack.push(5);
        stack.push(6);
        stack.push(9);
        stack.push(11);
        stack.push(2);
        stack.push(20);

        System.out.println(stack.toString());
    }
}
