package com.heitian.ssm.foundation.chapter11_Vector.demo7;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "China", "Welcome", "Well", "Mojo", "Shanghai");


        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.print(next + "  ");
        }
    }
}
