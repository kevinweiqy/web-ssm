package com.heitian.ssm.foundation.chapter11_Vector.demo4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

       /* for (Integer i :
                collection) {
            System.out.println(i);
                    }*/

        Integer[] moreIns = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreIns));

        /*for (Integer i :
                collection) {
            System.out.println(i);
        }*/

//        System.out.println(collection);

        Collections.addAll(collection, 11, 12, 13, 14, 15);
        System.out.println(collection);

        Collections.addAll(collection, moreIns);
        System.out.println(collection);

    }
}
