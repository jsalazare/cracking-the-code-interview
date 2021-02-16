package com.coding.chapter2.one;


import com.coding.chapter2.MyLinkedList;
import com.coding.chapter2.Node;

public class RemoveDups {

    //1 -> 2 -> 3 -> 4
    public static void removeDups (Node head){

        Node i = head;
        Node j;
        Node previous;

        while (i != null) {
            previous = i;
            j = i.next;
            while (j != null) {
                if (i.val == j.val){
                    previous.next = j.next;
                } else {
                    previous = j;
                }
                j = j.next;
            }

            i = i.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();


        list.add(3);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);

        removeDups(list.getHead());
        System.out.println(list.toString());

    }
}
