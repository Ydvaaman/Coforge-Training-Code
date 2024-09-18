package com.coforge.collection;

import java.util.ArrayList;
import java.util.List;
class User{}
public class CollectionProgrm1 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add(1233);
        list1.add(123.34f);
        list1.add("delhi");
        list1.add(new User());

        System.out.println(list1);
        System.out.println(list1.get(0));

        list1.remove(0);
        System.out.println(list1);
        System.out.println(list1.contains(123.34f));

        System.out.println("==============list1 data=============");
        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }
    }
}
