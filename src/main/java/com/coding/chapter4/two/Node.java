package com.coding.chapter4.two;

public class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
    }

    Node() {
    }


    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        traversal(this, builder);
        return builder.toString();
    }

    private void traversal(Node n, StringBuilder b){
        if(n == null){
            return;
        }

        b.append(n.value).append(", ");

        traversal(n.left, b);
        traversal(n.right, b);
    }
}
