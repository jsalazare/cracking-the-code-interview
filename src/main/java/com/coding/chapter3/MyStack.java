package com.coding.chapter3;

import java.util.NoSuchElementException;

public class MyStack<T> {

    private static class StackNode <T> {
        private T item;
        private StackNode<T> next;

        StackNode(T item) {
            this.item = item;
        }

    }

    private StackNode<T> top;


    public T pop(){
        if(top == null){
            throw new NoSuchElementException("stack is empty");
        }
        T item = top.item;
        top = top.next;
        return item;
    }

    public void push(T item){
        StackNode<T> newItem = new StackNode<>(item);
        newItem.next = top;
        top = newItem;
    }

    public T peak (){
        return top.item;
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
