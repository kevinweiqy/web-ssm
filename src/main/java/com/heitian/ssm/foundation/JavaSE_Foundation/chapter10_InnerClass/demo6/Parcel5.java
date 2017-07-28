package com.heitian.ssm.foundation.JavaSE_Foundation.chapter10_InnerClass.demo6;

public class Parcel5 {
    public Destination destination(String s) {
        class PDestination implements Destination{

            private String label;

            public PDestination(String whereTo) {
                label = whereTo;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 parcel5 = new Parcel5();
        Destination destination = parcel5.destination("China");
    }
}
