package com.functionalinterfaces;

import com.data.Student;
import com.data.StudentDatabase;

import java.util.function.Predicate;

import java.util.*;

public class PredicateStudentExample {

    static Predicate<Student> studentPredicate =(student)->student.getGradeLevel()>=3;

    public static void filterStudentsByGradeLevel()
    {
        System.out.println("entered");
        List<Student> predicateExampleStudentList = StudentDatabase.getAllStudents();

        predicateExampleStudentList.forEach(student -> {
            System.out.println(studentPredicate.test(student));
        });

    }

    public static void main(String[] args) {
       filterStudentsByGradeLevel();
    }
}
