package com.heitian.ssm.foundation.chapter8_Polymorphism.demo3;

public class Stringed extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Stringed.play()" + note);
    }

    @Override
    public String what() {
        return "Stringed";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}
