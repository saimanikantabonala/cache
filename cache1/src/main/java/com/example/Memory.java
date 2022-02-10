package com.example;

import java.util.ArrayList;
import java.util.List;

public class Memory {
    Cache c=new Cache();
    List<Element> ml= new ArrayList<>();
    public Element searchElementInMemory(int key){
        Element element;
        element=c.searchElementInCache(key);
        if(element!=null){
            return element;
        }
        else{
            for(Element q:ml){
                if(q.key==key){
                    c.addElementToCache(q);
                    return q;
                }
            }
            return null;
        }
    }
    public void addElementInMemory(int key,String value){
        Element element=new Element(key,value);
        ml.add(element);
    }
}
