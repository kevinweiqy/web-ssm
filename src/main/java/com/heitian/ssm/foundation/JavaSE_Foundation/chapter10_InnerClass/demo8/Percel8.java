package com.heitian.ssm.foundation.JavaSE_Foundation.chapter10_InnerClass.demo8;

public class Percel8 {

    public Wrapping wrapping(int i) {
        return new Wrapping(i) {
            public int value() {
                return super.value() * 47;
            }
        };
    }

}
