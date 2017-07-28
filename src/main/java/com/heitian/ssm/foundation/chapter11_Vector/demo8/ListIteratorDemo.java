package com.heitian.ssm.foundation.chapter11_Vector.demo8;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Apple", "Banana", "Cat", "dog", "shit");
        ListIterator<String> li = list.listIterator();

        while (li.hasNext()) {
            System.out.println(li.next() + " " + li.nextIndex() + " " + li.previousIndex());
        }

        System.out.println();

        while (li.hasPrevious()) {
            System.out.println(li.previousIndex());
        }
    }
}
