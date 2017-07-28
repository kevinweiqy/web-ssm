package com.heitian.ssm.foundation.JavaSE_Foundation.chapter8_Polymorphism.demo1;

public class Wind extends Instrument {

    public void play(Note note) {
        System.out.println("Wind.play()" + note);
    }
}
