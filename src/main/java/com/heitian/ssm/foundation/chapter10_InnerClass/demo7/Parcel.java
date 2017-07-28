package com.heitian.ssm.foundation.chapter10_InnerClass.demo7;

public class Parcel {

    class MyContents implements Contents{

        private int i;

        @Override
        public int value() {
            return i;
        }
    }

    public Contents contents() {
        return new MyContents();
    }

    public static void main(String[] args) {
        Parcel parcel = new Parcel();
        Contents contents = parcel.contents();
    }
}
