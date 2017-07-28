package com.heitian.ssm.foundation.chapter11_Vector.demo9;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfInteger {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();

        Random random = new Random(47);

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(30));
        }

        System.out.println(integers);
    }
}
