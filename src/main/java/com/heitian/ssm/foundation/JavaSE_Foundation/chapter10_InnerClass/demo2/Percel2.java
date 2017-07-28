package com.heitian.ssm.foundation.JavaSE_Foundation.chapter10_InnerClass.demo2;

public class Percel2 {

    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination{
        private String label;

        public Destination(String label) {
            this.label = label;
        }

        public String readLabel() {
            return label;
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Percel2 percel2 = new Percel2();
        percel2.ship("China");

        Percel2 q = new Percel2();
        Percel2.Contents contents = q.contents();
        System.out.println();
        Percel2.Destination d = q.to("USA");
    }

}
