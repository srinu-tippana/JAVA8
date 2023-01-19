package com.functionalinterfaces;

import com.data.Student;
import com.data.StudentDatabase;

import java.util.function.Predicate;

import java.util.*;

public class PredicateStudentExample {

    static Predicate<Student> studentPredicate =(student)->student.getGradeLevel()>=3.1;

    static Predicate<Student> studentGradePredicate=(student)->student.getGpa()>=3.9;
    public static void filterStudentsByGradeLevel()
    {
        System.out.println("entered");
        List<Student> predicateExampleStudentList = StudentDatabase.getAllStudents();

        predicateExampleStudentList.forEach(student -> {
            System.out.println(studentPredicate.test(student));
        });

    }


    public static void filterStudentsByGpa(){


        System.out.println(" filter by gpa");
        List<Student> predicateGradeExample = StudentDatabase.getAllStudents();

        predicateGradeExample.forEach(student -> {
            if(studentPredicate.and(studentGradePredicate).test(student))
            {
                System.out.println(student);
            }
        });
    }
    public static void main(String[] args) {
       filterStudentsByGradeLevel();

       filterStudentsByGpa();
    }
}
