package com.coding.chapter3.two;

import java.util.NoSuchElementException;

public class MinStack {

    private static class StackNode <T> {
        private T item;
        private StackNode<T> next;

        StackNode(T item) {
            this.item = item;
        }

    }

    private StackNode<Integer> top;
    private StackNode <Integer> min = new StackNode<>(Integer.MAX_VALUE);


    public int pop(){
        if(top == null){
            throw new NoSuchElementException("stack is empty");
        }
        int item = top.item;
        top = top.next;
        if(item == min.item){
            min = min.next;
        }
        return item;
    }

    public void push(int item){
        StackNode<Integer> newItem = new StackNode<>(item);
        newItem.next = top;
        top = newItem;
        if(item < min.item){
            StackNode<Integer> newMin = new StackNode<>(item);
            newMin.next = min;
            min = newMin;
        }
    }

    public int peak (){
        return top.item;
    }

    public int getMin (){
        if(top==null){
            return Integer.MAX_VALUE;
        }
        return min.item;
    }


    public String toString(){
        StringBuffer bs = new StringBuffer();
        StackNode temp = top;
        bs.append("[");
        while(temp != null){
            bs.append(temp.item);
            if (temp.next == null)
                bs.append("]");
            else
                bs.append(", ");
            temp = temp.next;
        }

        return bs.toString();
    }
}
