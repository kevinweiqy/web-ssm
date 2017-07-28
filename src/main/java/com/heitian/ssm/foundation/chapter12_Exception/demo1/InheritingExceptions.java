package com.heitian.ssm.foundation.chapter12_Exception.demo1;

class SimpleException extends Exception {

}

public class InheritingExceptions {

    public void f() throws SimpleException {
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions ie = new InheritingExceptions();
        try {
            ie.f();
        } catch (SimpleException e) {
            System.out.println("Caught it!");
        }
    }
}
