package com.functionalinterfaces;

import com.data.Student;
import com.data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String,Double>>  studentFunction= (students->{

        Map<String,Double> studentGradeMap = new HashMap<>();
        System.out.println(students);

        students.forEach((student->{
            System.out.println(student+"\n");
            if(PredicateStudentExample.studentPredicate.test(student)){
                studentGradeMap.put(student.getName(),student.getGpa());
            }

        }));

        return studentGradeMap;
    });

    public static void main(String[] args) {

        System.out.println(studentFunction.apply(StudentDatabase.getAllStudents()));

    }
}
