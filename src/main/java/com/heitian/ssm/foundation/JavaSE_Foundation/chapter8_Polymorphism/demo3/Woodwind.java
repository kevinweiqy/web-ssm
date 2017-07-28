package com.heitian.ssm.foundation.JavaSE_Foundation.chapter8_Polymorphism.demo3;

public class Woodwind extends Wind {
    @Override
    public void play(Note note) {
        System.out.println("Woodwind.play()" + note);
    }

    @Override
    public String what() {
        return "Woodwind";
    }
}
