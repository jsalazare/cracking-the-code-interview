package com.coding.chapter4.two;

public class MinimalTree {


    public static void main(String[] args) {

        int [] arr = new int [] {1,2,3,4,5,6,7,8,9,10,11};
        Node root = createMinimalTree(arr);
        System.out.println(root.toString());

    }
    public static Node createMinimalTree(int [] arr) {
        Node root = new Node(arr[(arr.length-1)/2]);
        createMinimalTree(root, (arr.length-1)/2, 0, arr.length-1, arr);
        return root;
    }

    public static void createMinimalTree(Node n, int middle, int leftLimit, int rightLimit, int [] arr){
        int newLeft = (middle + leftLimit) / 2;
        int newRight = (middle + rightLimit) / 2;

        if(newLeft > leftLimit && newLeft < middle) {
            n.left = new Node(arr[newLeft]);
            createMinimalTree(n.left, newLeft, leftLimit, middle, arr);
        }

        if(newRight < rightLimit && newRight > middle) {
            n.right = new Node(arr[newRight]);
            createMinimalTree(n.right, newRight, middle, rightLimit, arr);
        }
    }

}
