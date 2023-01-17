package com.functionalinterfaces;

import com.data.Student;
import com.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
   static  Consumer<Student> consumer = (student)->System.out.println(student);
    static Consumer<Student> consumer1 =(student)->System.out.print(student.getName());

    static Consumer<Student> consumer2 =(student)->System.out.println(student.getActivites());
    public static void printName(){




        List<Student> studentDetails=StudentDatabase.getAllStudents();

        studentDetails.forEach(consumer);


    }


    public static void printNameAndActivities(){


        List<Student>  studentNamesAndActivites = StudentDatabase.getAllStudents();

        studentNamesAndActivites.forEach(consumer1.andThen(consumer2)); //consumer chaining
    }
    public static void printNameAndActivitiesUsingCondition(){


        List<Student>  studentNamesAndActivites = StudentDatabase.getAllStudents();

        studentNamesAndActivites.forEach(student -> {
            if(student.getGradeLevel()>=3 && student.getGpa()>=3.9)
            {
                consumer1.andThen(consumer2).accept(student);
            }
        });





    }

    public static void main(String[] args) {

        Consumer<String> consumer = (s)->System.out.println(s.toUpperCase());

        //printName();
        consumer.accept("java 8");
        //printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
