package com.functionalinterfaces;

import java.util.function.UnaryOperator;

/***
 *  UnaryOperator is basically the extension of functional interface Fuction
 *  the difference is Function  and Bifunction used mostly when dealing with where input and output are differern
 *  Unary Operator is the variation of function where input and the output will be the same
 */
public class UnaryOperatorExample {

   static UnaryOperator<String> unaryOperator =(s)->s.concat("Deafult");
    public static void main(String[] args) {

        System.out.println(unaryOperator.apply("Srinu"));
    }
}
