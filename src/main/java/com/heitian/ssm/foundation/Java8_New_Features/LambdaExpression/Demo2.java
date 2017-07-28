package com.heitian.ssm.foundation.Java8_New_Features.LambdaExpression;

import java.util.Arrays;
import java.util.List;

/**
 * Created by bill on 2017/7/18.
 */
public class Demo2 {
    public static void main(String[] args) {


//        Demo2 demo2 = new Demo2();

//        MathOperation


        List<String> countries = Arrays.asList("China", "USA", "Japan", "Canada");
       /* for (String s : countries) {
            System.out.println(s);
        }*/

       //Java 8 之后
//        countries.forEach(n -> System.out.println(n));

        //使用java 8  的方法引用
        countries.forEach(System.out::println);
    }
}
