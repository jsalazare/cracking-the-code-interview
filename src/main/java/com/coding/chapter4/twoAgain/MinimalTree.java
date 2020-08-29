package com.coding.chapter4.twoAgain;

public class MinimalTree {
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


    public static Node createMinimalTree(int [] arr) {
        Node res = buildTree(0, arr.length - 1, arr);
        return res;
    }

    public static Node buildTree(int start, int end, int arr []){

        if (start <= end) {
            int mid = (start + end)/2;
            Node node = new Node(arr[mid]);

            node.left = buildTree(start, mid - 1, arr);
            node.right = buildTree(mid + 1, end, arr);


            return node;
        }
        return null;
    }




    public static void main(String[] args) {

        createMinimalTree(new int []{1,2,3,4,5,6,7});

    }
}
