package com.coforge.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPrgm1 {
    public static void main(String[] args) {
        Set<String> citySet = new HashSet<>();
        citySet.add("delhi");
        citySet.add("agra");
        citySet.add("mathura");
        citySet.add("delhi");

        System.out.println(citySet);

        Iterator<String> cityIt = citySet.iterator();
        System.out.println("using iterator");
        while (cityIt.hasNext())
            System.out.print(cityIt.next()+", ");

        System.out.println("using for each");
        for(String s:citySet){
            System.out.print(s+", ");
        }
    }
}
