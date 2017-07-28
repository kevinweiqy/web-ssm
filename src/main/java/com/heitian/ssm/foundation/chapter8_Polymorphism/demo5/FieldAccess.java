package com.heitian.ssm.foundation.chapter8_Polymorphism.demo5;

class Super {
    public int field = 0;

    public int getField() {
        return field;
    }
}

class Sub extends Super{
    public int field = 1;
    public int getField(){
        return field;
    }

    public int getSuperFiled() {
        return super.field;
    }
}

