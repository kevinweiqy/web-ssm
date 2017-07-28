package com.heitian.ssm.foundation.JavaSE_Foundation.chapter8_Polymorphism.demo7;


class Glyph{
    void draw() {
        System.out.println("Glyph.draw()");
    }

    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph{
    private int radius = 1;

    RoundGlyph(int radius) {
        this.radius = radius;
        System.out.println("RoundGlyph(), radius = " + radius);
    }

    void draw(){
        System.out.println("RoundGlyph.draw(), radisu = " + radius);
    }
}




public class PolyConstructor {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
