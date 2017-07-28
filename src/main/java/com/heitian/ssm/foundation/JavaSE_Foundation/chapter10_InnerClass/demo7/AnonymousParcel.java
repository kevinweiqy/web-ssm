package com.heitian.ssm.foundation.JavaSE_Foundation.chapter10_InnerClass.demo7;

public class AnonymousParcel {

    public Contents contents() {
        return new Contents() {

            private int i;

            @Override
            public int value() {
                return i;
            }
        };
    }
}
