package com.heitian.ssm.foundation.chapter10_InnerClass.demo10;

public class Parcel10 {

    public static void main(String[] args) {
        Parcel10 parcel10 = new Parcel10();
        Destination destination = parcel10.destination("China", 65.23f);
    }

    public Destination destination(final String dest, final float price) {
        return new Destination() {
            private int cost;
            private String label = dest;

            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("Over Budget!");
                }
            }

            @Override
            public String readLabel() {
                return label;
            }
        };
    }
}
