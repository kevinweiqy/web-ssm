package com.heitian.ssm.foundation.chapter11_Vector.demo3;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }

        for (Integer i :
                integers) {
            System.out.println(i);
        }
    }
}
