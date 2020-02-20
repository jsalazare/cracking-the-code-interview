package com.coding.chapter3.five;

import java.util.NoSuchElementException;

public class SortStack {
    private static class StackNode  {
        private int item;
        private StackNode next;

        StackNode(int item) {
            this.item = item;
        }

    }

    private StackNode top;


    public int pop(){
        if(top == null){
            throw new NoSuchElementException("stack is empty");
        }
        int item = top.item;
        top = top.next;
        return item;
    }

    public void push(int item){
        StackNode newItem = new StackNode(item);
        StackNode current = top;
        if(current == null || current.item >= item){
            newItem.next = top;
            top = newItem;
            return;
        }
        while(current.next != null){
            if(current.next.item > item){
                newItem.next = current.next;
                current.next = newItem;
                return;
            }
            current = current.next;
        }

        current.next = newItem;

    }

    public int peak (){
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
