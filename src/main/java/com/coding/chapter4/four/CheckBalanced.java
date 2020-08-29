package com.coding.chapter4.four;

import com.coding.chapter4.twoAgain.MinimalTree;

public class CheckBalanced {
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

    public static boolean isBalanced (Node root){
        if (root == null) return false;

        return getHeight(root) != -1;
    }


    public static int getHeight(Node root){
        if (root == null) return 0;

        int left = getHeight(root.left);
        int right = getHeight(root.right);

        if (Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        Node root = buildTree();

        System.out.println(isBalanced(root));
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

        Node ten = new Node(10);

        root.left = two;
        root.right = three;


        two.left = four;
        two.right = five;

        three.left = six;
        three.right = seven;

        four.left = eight;
        five.left = nine;


        eight.left = ten;

        return root;
    }
}
