package com.functionalinterfaces;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.data.Student;
import com.data.StudentDatabase;


public class PredicateandConsumerExample {

    Predicate<Student> predicateGrade =(s)->s.getGradeLevel()>=3;

    Predicate<Student> predicateGpa =(s)->s.getGpa()>=3;

    BiPredicate<Integer,Double> biPredicate = (gradeLevel,gpa)->gradeLevel>=3 && gpa>=3.9;

    BiConsumer<String,List<String>> studentBiConsumer =(name,activites)->{
       System.out.println(name+":"+activites);
    };

    Consumer<Student> studentConsumer =(student)->{

        if(predicateGrade.and(predicateGpa).test(student))
        {
            studentBiConsumer.accept(student.getName(),student.getActivites());
        }
         // System.out.println(student);

        System.out.println("the biconsumer bi predicate test");
        if(biPredicate.test(student.getGradeLevel(),student.getGpa()))
        {
              studentBiConsumer.accept(student.getName(),student.getActivites());
        }

    };
    public void printNameAndActivities(){

        List<Student> studentList = StudentDatabase.getAllStudents();
       /* studentList.forEach(student->{
            if(predicateGrade.and(predicateGpa).test(student))
            {
                studentConsumer.accept(student);
            }
        });*/
        studentList.forEach(studentConsumer);

    }
    public static void main(String[] args) {

        PredicateandConsumerExample predicateandConsumerExample =  new PredicateandConsumerExample();

        predicateandConsumerExample.printNameAndActivities();

    }
}
