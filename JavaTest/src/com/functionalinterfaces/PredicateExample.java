package com.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
   static  Predicate<Integer> predicate =(i)->{
        return i%2==0;
    };

   static Predicate<Integer> predicate1 =(i)->i%2==0;

   public static void predicateAnd(){

   }
    public static void main(String[] args) {

        System.out.println(predicate.test(3));
       System.out.println(predicate1.test(4 ));


    }
}
