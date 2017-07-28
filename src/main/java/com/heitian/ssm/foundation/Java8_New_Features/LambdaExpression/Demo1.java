package com.heitian.ssm.foundation.Java8_New_Features.LambdaExpression;

/**
 * Created by bill on 2017/7/17.
 */
public class Demo1 {


    public static void printMessage(String name) {
        System.out.println(name);
    }


    public static void main(String[] args) {
//        printMessage("hello");

        /*String message = "hello";
        name -> System.out.println("hi");*/


        //before java 8
       /* new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java 8, too much code for too little to do");
            }
        }).start();*/


        //after java 8
        new Thread(() -> System.out.println("After java 8, everything rocks")).start();

        Thread thread = new Thread(() -> System.out.println());
        thread.start();


        /*System.out.println("我要找个女朋友");

        System.out.println("我的未来是什么？？？");

        for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }*/
    }


}
