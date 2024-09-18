package com.coforge.collection;

import java.util.HashSet;
import java.util.Set;

public class DuplicateRemoval_Set {

        public static int[] removeDuplicate(int arr[]){
            Set<Integer> set1 = new HashSet<>();
            for(int x:arr)
                set1.add(x);

            Object[] array = set1.toArray();

            int p[] = new int[array.length];
            int x = 0;
            for (Object o : array)
                p[x++] = Integer.parseInt(o.toString());

            return p;
    }

    public static void main(String[] args) {
        int[] arr = {11,2,3,4,2,3,1,11,5,6};
        for(int n : arr) {
            System.out.print(n+" ");
        }
        System.out.println("\nafter removing the duplicates");

        for(int num : removeDuplicate(arr))
            System.out.print(num+" ");
    }
}
