package com.coding.chapter4.three;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ListOfDepths {

    static class Node {
        Node left;
        Node right;
        int val;

        public Node(int val) {
            this.val = val;
        }

        public Node() {
        }
    }

    public static ArrayList<LinkedList<Node>> listOfDepths (Node root) {
        Queue<Node> queue = new LinkedList<>();
        ArrayList<LinkedList<Node>> result = new ArrayList<>();
        int level = 0;

        queue.add(root);
        Node current;

        while (!queue.isEmpty()){
            int size = queue.size();
            LinkedList<Node> list = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                current = queue.poll();
                list.add(current);


                if (current.left != null){
                    queue.add(current.left);
                }

                if (current.right != null){
                    queue.add(current.right);
                }
            }
            result.add(list);
        }

        return result;
    }

    public static void main(String[] args) {

        Node root = buildTree();

        listOfDepths(root);
    }

    private static Node buildTree(){
        Node root = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);

        Node eight = new Node(8);
        Node nine = new Node(9);

        root.left = two;
        root.right = three;


        two.left = four;
        two.right = five;

        three.left = six;
        three.right = seven;

        four.left = eight;
        five.left = nine;

        return root;
    }
}
