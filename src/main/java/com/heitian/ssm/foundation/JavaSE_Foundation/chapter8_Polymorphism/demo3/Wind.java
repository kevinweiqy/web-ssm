package com.heitian.ssm.foundation.JavaSE_Foundation.chapter8_Polymorphism.demo3;

public class Wind extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Wind.play()" + note);
    }

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Wind");
    }
}
