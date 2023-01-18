package com.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
   static  Predicate<Integer> predicate =(i)->{
        return i%2==0;
    };

   static Predicate<Integer> predicate1 =(i)->i%2==0;

   static Predicate<Integer> predicate2 =(i)->i%5==0;

    /**
     * This method is to test the combination of predicate's test and  functions  Declared as static so that can be called from the context
     */
   public static void predicateAnd(){

       System.out.println(predicate1.and(predicate2).test(10));
       System.out.println(predicate1.or(predicate2).test(4));
   }
    public static void main(String[] args) {

        System.out.println(predicate.test(3));
       System.out.println(predicate1.test(4 ));


       predicateAnd();






    }
}
