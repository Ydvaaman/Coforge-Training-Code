package com.coforge.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1001,"suresh kumar");
        map.put(1003,"aman kumar");
        map.put(1002,"naina kumar");
        map.put(1004,"rohit kumar");
        map.put(1005,"rahul kumar");
        System.out.print(map);
        for(Integer i: map.keySet()){
            System.out.println(i+" "+map.get(i));
        }

    }
}
