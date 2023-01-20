package com.functionalinterfaces;

public class FunctionMultiClassExample {

    public static String performConcat(String str)
    {
          return FunctionExample.addSomeString.apply(str);
    }

    public static void main(String[] args) {

       String result= performConcat("sri");

       System.out.println(result);

    }
}
