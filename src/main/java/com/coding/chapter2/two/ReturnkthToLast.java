package com.coding.chapter2.two;

import com.coding.chapter2.MyLinkedList;
import com.coding.chapter2.Node;

public class ReturnkthToLast {

    /// 1 -> 2 -> 3 -> 4
    public static Node returnKthToLast (Node head, int kthToLast) {

        Node n = head;
        Node n2 = head;
        int counter = 0;

        while (n != null){
            counter++;
            n = n.next;
        }

        int countTo = counter - kthToLast;

        if (countTo <= 0){
            throw new RuntimeException("K th to last number should not be greater or equals than list size");
        }

        int newCounter = 0;

        while (n2 != null){
            newCounter++;
            if (newCounter == countTo){
                return n2;
            }
            n2 = n2.next;
        }

        return n2;
    }





    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(returnKthToLast(list.getHead(),1).val);

    }
}
