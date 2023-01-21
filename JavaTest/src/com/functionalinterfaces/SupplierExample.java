package com.functionalinterfaces;

import com.data.Student;
import com.data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * consumer takes input and doesnt give any output
 * Supplier doesnot take any input but gives output
 */
public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Student> studentSupplier = ()->{
            return new Student("Srinu",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
        };

        Supplier<List<Student>> listSupplier =()->{
            return StudentDatabase.getAllStudents();
        };

        System.out.println(studentSupplier.get());

        System.out.println(listSupplier.get());
    }
}
