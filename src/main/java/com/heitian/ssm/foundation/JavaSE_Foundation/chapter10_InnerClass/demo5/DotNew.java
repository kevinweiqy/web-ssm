package com.heitian.ssm.foundation.JavaSE_Foundation.chapter10_InnerClass.demo5;

public class DotNew {
    public class Inner {

    }

    public static void main(String[] args) {
        DotNew dotNew = new DotNew();
        DotNew.Inner inner = dotNew.new Inner();
    }
}
