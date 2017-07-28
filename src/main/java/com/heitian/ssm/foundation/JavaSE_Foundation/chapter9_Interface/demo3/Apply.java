package com.heitian.ssm.foundation.JavaSE_Foundation.chapter9_Interface.demo3;


import java.util.Arrays;

class Processor{
    public String name(){
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}

class Upcase extends Processor{
    String process(Object input) {
        return ((String)input).toUpperCase();
    }
}

class Downcase extends Processor{
    String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends Processor{
    String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}

public class Apply {

    public static void process(Processor processor, Object object) {
        System.out.println("Using processor: " + processor.name());
        System.out.println(processor.process(object));
    }

    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }

}
