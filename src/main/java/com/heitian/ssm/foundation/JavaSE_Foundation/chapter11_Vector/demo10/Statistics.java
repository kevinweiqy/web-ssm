package com.heitian.ssm.foundation.JavaSE_Foundation.chapter11_Vector.demo10;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {

    public static void main(String[] args) {
        Random random = new Random();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 1000000; i++) {
            int r = random.nextInt(20);
            Integer requ = map.get(r);
            map.put(r, requ == null ? 1 : requ + 1);
        }
        System.out.println(map);
    }
}
