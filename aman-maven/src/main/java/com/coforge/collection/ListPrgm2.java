package com.coforge.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListPrgm2 {
    public static void main(String[] args) {
        ArrayList<String> bookList = new ArrayList<>();
        LinkedList<String> bookList1 = new LinkedList<>();
        bookList1.add("java in action");
        bookList1.add("java for beginner action");
        bookList1.addLast("spring in action");
        bookList1.add("java professionl");
        bookList1.addFirst("java for dummies");

        System.out.println(bookList1);

        LinkedList<String > reversed = bookList1.reversed();
        System.out.println(reversed);
        bookList1.removeFirst();

        Vector<String> vector1 = new Vector<>(bookList1);
        System.out.println(vector1.capacity());
        System.out.println(vector1.size());
        System.out.println(vector1);
        System.out.println();
    }
}
