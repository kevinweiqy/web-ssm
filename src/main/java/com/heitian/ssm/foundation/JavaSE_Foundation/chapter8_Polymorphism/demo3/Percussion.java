package com.heitian.ssm.foundation.JavaSE_Foundation.chapter8_Polymorphism.demo3;

public class Percussion extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Percussion.play()" + note);
    }

    @Override
    public String what() {
        return "Percussion";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}
