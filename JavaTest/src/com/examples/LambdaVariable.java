package com.examples;

import java.util.function.Consumer;

public class LambdaVariable {

    int  result;

    public static void main(String[] args) {

        Consumer<Integer> consumer =(i->{

            LambdaVariable lamdaVariable = new LambdaVariable();
            lamdaVariable.result=123;
            System.out.println(lamdaVariable.result);
        });

        consumer.accept(4);
    }
}
