package com.coding.chapter3.six;

import org.junit.Assert;
import org.junit.Test;


public class CatsAndDogsQueueTest {


    @Test
    public void testCatsAndDogQueue(){
        CatsAndDogsQueue queue = createCatsAndDogsQueue();

        Assert.assertEquals("[cat, cat, cat, dog, dog, dog, cat, dog]", queue.toString());
    }


    @Test
    public void testRemoveDogs(){
        CatsAndDogsQueue queue = createCatsAndDogsQueue();

        queue.dequeueDog();
        Assert.assertEquals("[cat, cat, cat, dog, dog, cat, dog]", queue.toString());
    }

    @Test
    public void testRemoveCats(){
        CatsAndDogsQueue queue = createCatsAndDogsQueue();

        queue.dequeueCat();
        Assert.assertEquals("[cat, cat, dog, dog, dog, cat, dog]", queue.toString());
    }

    @Test
    public void testRemoveDogsAndCats(){
        CatsAndDogsQueue queue = createCatsAndDogsQueue();

        queue.dequeueDog();
        queue.dequeueCat();
        queue.dequeueCat();
        queue.dequeueCat();
        queue.dequeueCat();
        Assert.assertEquals("[dog, dog, dog]", queue.toString());
    }

    private CatsAndDogsQueue createCatsAndDogsQueue (){
        CatsAndDogsQueue queue = new CatsAndDogsQueue();
        queue.enqueue("cat");
        queue.enqueue("cat");
        queue.enqueue("cat");
        queue.enqueue("dog");
        queue.enqueue("dog");
        queue.enqueue("dog");
        queue.enqueue("cat");
        queue.enqueue("dog");
        return queue;
    }
}
