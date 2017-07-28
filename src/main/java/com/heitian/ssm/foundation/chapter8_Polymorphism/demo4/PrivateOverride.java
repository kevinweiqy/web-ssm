package com.heitian.ssm.foundation.chapter8_Polymorphism.demo4;

public class PrivateOverride {

    private void f() {
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride privateOverride = new NewClass();
        privateOverride.f();
    }
}

class NewClass extends PrivateOverride{
    public void f() {
        System.out.println("public f()");
    }
}
