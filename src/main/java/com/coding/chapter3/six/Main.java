package com.coding.chapter3.six;

public class Main {
    public static void main(String[] args) {
        CatsAndDogsQueue queue = new CatsAndDogsQueue();

        queue.enqueue("cat");
        queue.enqueue("cat");
        queue.enqueue("cat");
        queue.enqueue("dog");
        queue.enqueue("dog");
        queue.enqueue("dog");
        queue.enqueue("cat");
        queue.enqueue("dog");
        System.out.println(queue);
        queue.dequeueDog();
        System.out.println(queue);
        queue.dequeueCat();
        queue.dequeueCat();
        queue.dequeueCat();
        System.out.println(queue);
        queue.dequeueCat();
        System.out.println(queue);

    }
}
