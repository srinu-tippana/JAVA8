package com.functionalinterfaces;

import com.data.Student;
import com.data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionFunctional {

    /***
     * The first two parameters mentioned in the generics are the inputs that  this BiFunction takes and the third one is the parameter that we get as result
     */
    static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFunction =((students, studentPredicate) -> {

        Map<String,Double> stringGradeMap = new HashMap<>();

        students.forEach(student -> {
            if(studentPredicate.test(student))
            {
                stringGradeMap.put(student.getName(),student.getGpa());

            }

        });
        return stringGradeMap;
    });


    public static void main(String[] args) {

        List<Student> studentList = StudentDatabase.getAllStudents();
        /*
        static Predicate<Student> studentPredicate =(student)->student.getGradeLevel()>=3.1;
        what exactly is the studentPredicate
         */
        System.out.println(biFunction.apply(studentList,PredicateStudentExample.studentPredicate));

    }
}
