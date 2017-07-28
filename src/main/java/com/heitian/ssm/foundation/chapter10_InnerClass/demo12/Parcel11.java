package com.heitian.ssm.foundation.chapter10_InnerClass.demo12;

public class Parcel11 {

    private static class ParcelContents implements Contents {
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }

    protected static class ParcelDestination implements Destination {

        private String label;

        public ParcelDestination(String whereTo) {
            this.label = whereTo;
        }

        @Override
        public String readLabel() {
            return null;
        }
    }


}
