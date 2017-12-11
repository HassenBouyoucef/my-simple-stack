package deqo.bhas.mysimplestack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleStackImplTest {

    SimpleStackImpl simpleStack;
    @Before
    public void setUp() throws Exception {
        simpleStack = new SimpleStackImpl() ;
        System.out.println("je suis exe chaque test");
    }

    @Test
    public void getSize() throws Exception {
        Assert.assertEquals(0,simpleStack.getSize());
        simpleStack.push(new Item("hassen"));
        Assert.assertEquals(1,simpleStack.getSize());
    }

    @Test
    public void isEmpty() throws Exception {
        Assert.assertEquals(true,simpleStack.isEmpty());
        simpleStack.push(new Item("hassen"));
        Assert.assertEquals(false,simpleStack.isEmpty());
    }

    @Test
    public void push() throws Exception {
        Assert.assertEquals(0,simpleStack.getSize());
        simpleStack.push(new Item("hassen"));
        Assert.assertEquals(1,simpleStack.getSize());
        Item o = (Item)simpleStack.peek();
        Assert.assertEquals("hassen",o.getValue());
    }

    @Test
    public void peek() throws Exception {
        Assert.assertEquals(0,simpleStack.getSize());
        simpleStack.push(new Item("hassen"));
        Assert.assertEquals(1,simpleStack.getSize());
        Item o = (Item)simpleStack.peek();
        Assert.assertEquals(1,simpleStack.getSize());
        Assert.assertEquals("hassen",o.getValue());
    }

    @Test
    public void pop() throws Exception {
        Assert.assertEquals(0,simpleStack.getSize());
        simpleStack.push(new Item("hassen"));
        Assert.assertEquals(1,simpleStack.getSize());
        Item o = (Item)simpleStack.pop();
        Assert.assertEquals(0,simpleStack.getSize());
        Assert.assertEquals("hassen",o.getValue());
    }

}