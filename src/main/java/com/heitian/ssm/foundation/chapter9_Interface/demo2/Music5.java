package com.heitian.ssm.foundation.chapter9_Interface.demo2;


class Wind implements Instrument {

    @Override
    public void play(Note note) {
        System.out.println(this + ".play()" + note);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    public String toString() {
        return "Wind";
    }
}


class Percussion implements Instrument {

    @Override
    public void play(Note note) {
        System.out.println(this + ".play() " + note);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    public String toString() {
        return "Percussion";
    }
}

class Stringed implements Instrument {

    @Override
    public void play(Note note) {
        System.out.println(this + ".play() " + note);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind{
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind{
    @Override
    public String toString() {
        return "Woodwind";
    }
}



public class Music5 {

    public static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] instruments) {
        for (Instrument instument :
                instruments) {
            tune(instument);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestary = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestary);
    }
}
