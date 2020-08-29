package com.coding.chapter4.one;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class RouteBetweenNode {


    static class Node {
        int val;
        ArrayList<Node> elements;


        public Node(int val) {
            this.val = val;
            elements = new ArrayList<>();
        }


        public void add (Node newNode){
            this.elements.add(newNode);
        }
    }


    //
    //      2  - 5
    //    /      |
    //  1  - 3 - 6 - 8
    //    \          |
    //      4 - 7  - 9



    public static boolean BreadthFirstSearch(Node nodeOne, Node nodeTwo) {
        Queue<Node> queue = new LinkedList<>();
        HashSet<Node> visited = new HashSet<>();
        queue.add(nodeOne);

        Node current;
        while(!queue.isEmpty()){
            current = queue.poll();

            if(current == nodeTwo){
                return true;
            }

            for (Node node:current.elements) {
                if(!visited.contains(node)){
                    visited.add(node);
                    queue.add(node);
                }
            }
        }

        return false;
    }



    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);

        one.add(two);
        one.add(three);
        one.add(four);


        two.add(five);
        three.add(six);
        four.add(seven);

        six.add(eight);
        seven.add(nine);

        five.add(six);

        eight.add(nine);

        //make a cicle
        nine.add(seven);
        seven.add(four);
//        four.add(one); uncomment this to make the cycle.


        System.out.println(BreadthFirstSearch(five, three));



    }
}