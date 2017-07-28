package com.heitian.ssm.foundation.chapter9_Interface.demo1;

public abstract class Instrument {
    private int i;

    public abstract void play(Note note);

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();


}
