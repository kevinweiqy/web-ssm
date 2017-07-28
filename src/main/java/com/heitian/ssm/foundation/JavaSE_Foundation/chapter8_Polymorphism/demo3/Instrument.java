package com.heitian.ssm.foundation.JavaSE_Foundation.chapter8_Polymorphism.demo3;

public class Instrument {

    public void play(Note note) {
        System.out.println("Instument.play()" + note);
    }

    public String what() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }

}
