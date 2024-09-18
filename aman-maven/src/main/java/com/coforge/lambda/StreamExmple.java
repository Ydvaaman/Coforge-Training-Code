package com.coforge.lambda;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamExmple {
    public static void main(String[] args) {
        Integer arr[] = {11,2,30,14,5,6,90};
        Stream.of(arr);
        Stream.of(arr).filter(a->(a>10)).forEach(a-> System.out.print(a+", "));
        System.out.println();

        Stream.of(arr).sorted().forEach(a-> System.out.println(a+", "));
        System.out.println("\n sorted and limit of 3");
        Stream.of(arr).sorted().limit(3).forEach(a-> System.out.println(a+", "));
        new ArrayList<>().stream();
    }
}
