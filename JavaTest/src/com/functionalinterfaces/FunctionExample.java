package com.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {


    static Function<String,String> function = (name)->name.toUpperCase();

    static Function<String,String> addSomeString =(name)->name.toUpperCase().concat(" example that concat has worked");




    public static void main(String[] args) {

         System.out.println("Result is "+function.andThen(addSomeString).apply("srinu"));


         System.out.println(function.compose(addSomeString).apply("java8"));


    }
}
