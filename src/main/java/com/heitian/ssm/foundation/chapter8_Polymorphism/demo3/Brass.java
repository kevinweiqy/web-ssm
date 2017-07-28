package com.heitian.ssm.foundation.chapter8_Polymorphism.demo3;

public class Brass extends Wind {
    @Override
    public void play(Note note) {
        System.out.println("Brass.play()" + note);
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Brass");
    }
}
