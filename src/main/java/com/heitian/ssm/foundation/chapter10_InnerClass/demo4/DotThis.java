package com.heitian.ssm.foundation.chapter10_InnerClass.demo4;

public class DotThis {
    public void f(){
        System.out.println("DotThis.f()");
    }

    public class Inner{
        public DotThis out(){
            return DotThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dotThis = new DotThis();
        DotThis.Inner inner = dotThis.inner();
        inner.out().f();
    }
}
