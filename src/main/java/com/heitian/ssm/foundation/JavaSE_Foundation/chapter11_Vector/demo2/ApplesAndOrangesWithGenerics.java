package com.heitian.ssm.foundation.JavaSE_Foundation.chapter11_Vector.demo2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Apple {

}

class GrannySmith extends Apple{}

class Gala extends Apple {}
class Fuji extends Apple{}

class Orange {
}


public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        /*ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }

        for (Apple apple :
                apples) {
            System.out.println(apple);
        }*/


        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
//        apples.add()
        //

        for (Apple apple :
                apples) {
            System.out.println(apple.getClass().getSimpleName());
        }

        List<Apple> apples1 = new LinkedList<>();
    }
}
