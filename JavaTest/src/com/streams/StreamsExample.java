package com.streams;

import com.data.Student;
import com.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {

        Predicate<Student> studentPredicate = (student -> student.getGradeLevel()>=3);
        Predicate<Student> studentGpaPredicate =(student->student.getGpa()>=3.9);

        Map<String, List<String>> studentMap=
        StudentDatabase.getAllStudents().stream()
                .filter(studentPredicate)
                 .filter(studentGpaPredicate)
                .collect(Collectors.toMap(Student::getName,Student::getActivites));

        System.out.println(studentMap);
    }
}
