package com.methodreference;

import com.data.Student;
import com.data.StudentDatabase;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String,String> toUpperCaseLambda =(s)->s.toUpperCase();



    static Function<String,String> toUpperMethodReference =String::toUpperCase;


    static Consumer<Student> c1 = p->System.out.println(p);

    static Consumer<Student> c2 = System.out::println;

    /**
     * Method reference  that prints list of activities
     */
    static  Consumer<Student> consumer = Student::printListOfActivities;

    public static void main(String[] args) {

         System.out.println(toUpperCaseLambda.apply("srinu"));

         System.out.println(toUpperMethodReference.apply("sri"));

        //StudentDatabase.getAllStudents().forEach(c2);

        StudentDatabase.getAllStudents().forEach(consumer);
    }
}
