package com.coding.chapter2;

public class MyLinkedList {

    Node head;
    Node last;
    int size;

    public MyLinkedList() {
        size = 0;
    }

    public void add (int element){
        Node node = new Node(element);
        if (size == 0){
            head = node;
            last = node;
            size++;
            return;
        }

        last.next = node;
        last = last.next;
        size++;
    }

    public Node getHead (){
        return head;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node n = head;

        while (n != null){
            if (n.next == null){
                sb.append(n.val);
            } else {
                sb.append(n.val).append(", ");
            }
            n = n.next;
        }
        sb.append("]");
        return sb.toString();
    }





}
