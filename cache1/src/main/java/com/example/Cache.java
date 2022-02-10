package com.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class Cache {
    Deque<Element> cq= new ArrayDeque<>(5);
    public Element searchElementInCache(int key){
        for(Element q:cq){
            if(q.key== key){
                cq.remove(q);
                cq.push(q);
                return q;
            }
        }
        return null;
    }
    public void addElementToCache(Element element){
        if(cq.size()<5){
            cq.push(element);
        }
        else{
            cq.poll();
            cq.add(element);
        }
    }
}
