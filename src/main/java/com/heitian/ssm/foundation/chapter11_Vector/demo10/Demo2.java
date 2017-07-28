package com.heitian.ssm.foundation.chapter11_Vector.demo10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo2 {

    public static void main(String[] args) {


        Map<String, Set<String>> map = new HashMap<>();
        Set<String> a = new HashSet<>();
        a.add("America");
        a.add("Africa");
        a.add("Afraid");
        map.put("a", a);

        Set<String> b = new HashSet<>();
        b.add("Boy");
        b.add("Banana");
        b.add("Blue");
        map.put("b", b);

        Set<String> c = new HashSet<>();
        c.add("Cat");
        c.add("Cata");
        map.put("c", c);

//        System.out.println(map);

        System.out.println(map.keySet());
    }
}
