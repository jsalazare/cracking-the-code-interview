package com.coding.chapter3.six;

import static com.sun.tools.internal.xjc.reader.Ring.add;

import java.util.LinkedList;
import java.util.Queue;



public class CatsAndDogsQueue {

    private Queue<String> queue = new LinkedList<>();

    public String dequeueAny(){
        return queue.poll();
    }

    public void enqueue(String animal){
        queue.add(animal);
    }

    public String dequeueCat(){
        String res = "";
        for (String animal: queue) {
            if(animal.equalsIgnoreCase("cat")){
                res = animal;
                queue.remove(animal);
                return res;
            }
        }

        return res;
    }

    public String dequeueDog(){
        String res = "";
        for (String animal: queue) {
            if(animal.equalsIgnoreCase("dog")){
                res = animal;
                queue.remove(animal);
                return res;
            }
        }

        return res;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int index = 0;
        for (String animal: queue) {
            sb.append(animal);
            if(index < queue.size() - 1){
                sb.append(", ");
            }
            index++;

        }
        sb.append("]");

        return sb.toString();
    }
}
