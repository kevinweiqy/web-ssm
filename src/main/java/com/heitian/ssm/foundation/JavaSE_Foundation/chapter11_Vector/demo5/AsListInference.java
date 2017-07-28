package com.heitian.ssm.foundation.JavaSE_Foundation.chapter11_Vector.demo5;

import java.util.Arrays;
import java.util.List;

class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}

public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Powder(), new Crusty(), new Slush());
        System.out.println(snow1);

        List<Snow> snow4 = Arrays.asList(new Light(), new Heavy());
        System.out.println(snow4);
    }
}
