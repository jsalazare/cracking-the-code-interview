package com.coding.chapter3.two;

import org.junit.Assert;
import org.junit.Test;

public class MinStackTest {


    @Test
    public void testHappyPath(){
        MinStack stack = new MinStack();
        stack.push(10);
        stack.push(3);
        stack.push(12);
        stack.push(5);

        Assert.assertEquals( 3,stack.getMin());
        stack.push(1);
        Assert.assertEquals( 1,stack.getMin());
    }

    @Test
    public void testRemoveMin(){
        MinStack stack = new MinStack();
        stack.push(11);
        stack.push(2);
        stack.push(12);
        stack.push(1);
        stack.push(13);

        Assert.assertEquals( 1,stack.getMin());
        stack.pop();
        stack.pop();
        Assert.assertEquals( 2,stack.getMin());
        stack.pop();
        stack.pop();
        Assert.assertEquals( 11,stack.getMin());
    }

    @Test
    public void testEmptyStack(){
        MinStack stack = new MinStack();
        stack.push(10);

        Assert.assertEquals( 10,stack.getMin());
        stack.pop();
        Assert.assertEquals(Integer.MAX_VALUE, stack.getMin());
    }

}
