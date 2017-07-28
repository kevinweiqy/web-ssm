package com.heitian.ssm.foundation.chapter10_InnerClass.demo9;

public class Parcel9 {


    public Destination destination(final String des) {
        return new Destination() {
            private String label = des;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }
}
