package com.heitian.ssm.foundation.chapter9_Interface.demo1;


class Wind extends Instrument {

    @Override
    public void play(Note note) {
        System.out.println("Wind.play() " + note);
    }

    @Override
    public void adjust() {
    }

    @Override
    public String what() {
        return "Wind";
    }
}

class Percussion extends Instrument {

    @Override
    public void play(Note note) {
        System.out.println("Percussion.play() " + note);
    }

    @Override
    public void adjust() {

    }

    @Override
    public String what() {
        return "Percussion";
    }
}


class Stringed extends Instrument{

    @Override
    public void play(Note note) {
        System.out.println("Stringed.play() " + note);
    }

    @Override
    public void adjust() {

    }

    @Override
    public String what() {
        return "Stringed";
    }
}

class Brass extends Wind{
    @Override
    public void play(Note note) {
        System.out.println("Brass.play() " + note);
    }

    @Override
    public void adjust() {
        System.out.println("Brass.adjust()");
    }
}

class Woodwind extends Wind{
    @Override
    public void play(Note note) {
        System.out.println("Woodwind.play() " + note);
    }

    @Override
    public String what() {
        return "Woodwind";
    }
}

public class Music4 {

    public static void tune(Instrument i) {
        i.play(Note.C_SHARP);
    }

    public static void tuneAll(Instrument[] instruments) {
        for (Instrument i :
                instruments) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] instruments = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };

        tuneAll(instruments);
    }

}
