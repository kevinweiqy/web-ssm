package com.heitian.ssm.foundation.chapter11_Vector.demo12;

import java.util.Map;

public class EnvironmentsVariables {
    public static void main(String[] args) {
        for (Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
