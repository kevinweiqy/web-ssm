package com.heitian.ssm.foundation.JavaSE_Foundation.chapter11_Vector.demo12;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ForEachCollections {
    public static void main(String[] args) {
        Collection<String> collection = new LinkedList<>();
        Collections.addAll(collection, "Take the long way home".split(" "));
        for (String s :
                collection) {
            System.out.print(s + " ");
        }
    }
}
