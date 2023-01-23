package com.methodreference;

import com.data.Student;
import com.data.StudentDatabase;

import java.util.function.Predicate;

public class RefractorMethodReferenceExample {

    static Predicate<Student> p1 =RefractorMethodReferenceExample::greaterThanGradeLevel;

    public static  boolean greaterThanGradeLevel(Student s)
    {
        return s.getGradeLevel()>=3;
    }

    public static void main(String[] args) {

        System.out.println(p1.test(( StudentDatabase.studentSupplier.get())));
    }
}
