package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CacheTest {
    @Test
    public void testMemory(){
        Memory m=new Memory();
        Element e;
        m.addElementInMemory(1,"Hi");
        m.addElementInMemory(2,"Hello");
        m.addElementInMemory(3,"bye");
        m.addElementInMemory(4,"good bye");
        m.addElementInMemory(5,"good morning");
        e=m.searchElementInMemory(3);
        System.out.println(e.key+e.value);
        e=m.searchElementInMemory(2);
        System.out.println(e.key+e.value);
        e=m.searchElementInMemory(4);
        System.out.println(e.key+e.value);
        e=m.searchElementInMemory(2);
        assertEquals(e,m.c.cq.peek());
    }

}
