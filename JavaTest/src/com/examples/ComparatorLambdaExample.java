package com.examples;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        /***
         * Prior java 8
         */

       Comparator<Integer> comparator = new Comparator<Integer>(){

           @Override
           public int compare(Integer i1,Integer i2)
           {
               return i1.compareTo(i2);   // 0<i1==i2
                                          // 1 if i1>i2
                                          //-1 if i1<i2
           }
       };
       System.out.println("Result of Comparator"+comparator.compare(3,4));

        /***
         * using  Lambda
         */

        Comparator<Integer> comparatorLamda = (Integer a ,Integer b)->{
           return a.compareTo(b);
        };

        System.out.println( comparatorLamda.compare(3,4));


        Comparator<Integer> comparatorLamda1 = (a ,b)->{
            return a.compareTo(b);
        };

        System.out.println("Comparator value"+comparatorLamda1.compare(5,5));



    }
}
