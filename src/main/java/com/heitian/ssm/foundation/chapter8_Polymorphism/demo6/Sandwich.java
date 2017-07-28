package com.heitian.ssm.foundation.chapter8_Polymorphism.demo6;

class Meal{
    Meal(){
        System.out.println("Meal()");
    }
}

class Bread{
    Bread() {
        System.out.println("Bread()");
    }
}

class Chess{
    Chess() {
        System.out.println("Chess()");
    }
}

class Lettuce{
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal{
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch{
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}


public class Sandwich extends PortableLunch {
    private Bread bread = new Bread();
    private Chess chess = new Chess();
    private Lettuce lettuce = new Lettuce();

    Sandwich() {
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}
