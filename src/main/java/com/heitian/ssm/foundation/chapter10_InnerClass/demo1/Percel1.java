package com.heitian.ssm.foundation.chapter10_InnerClass.demo1;

public class Percel1 {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }


    class Destination {
        private String label;

        public Destination(String whereto) {
            this.label = whereto;
        }

        String readLabel() {
            return label;
        }
    }

    public void ship(String dest) {
        Contents contents = new Contents();
        Destination destination = new Destination(dest);
        System.out.println(destination.readLabel());
    }

    public static void main(String[] args) {
        Percel1 percel1 = new Percel1();
        percel1.ship("New York");
    }
}
