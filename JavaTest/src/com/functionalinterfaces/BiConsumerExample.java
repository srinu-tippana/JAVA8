package com.functionalinterfaces;

import com.data.Student;
import com.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {


    public static void nameAndActivites(){
        BiConsumer<String,List<String>> studentActivitesConsumer =(name,activities)->{
             System.out.println(name+" "+activities);
        };
        List<Student>  studentList = StudentDatabase.getAllStudents();

        studentList.forEach(student -> {
            studentActivitesConsumer.accept(student.getName(),student.getActivites());
        });
    }
    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer =(a,b)->{
            System.out.println(a);
            System.out.println(b);
        };
        biConsumer.accept("srinu","tippana");


        BiConsumer<Integer,Integer> multiply =(a,b)->{

            System.out.println(a*b);
        };

        //multiply.accept(3,4);

        BiConsumer<Integer,Integer> divison =(a,b)->{
            System.out.println(a/b);
        };

        multiply.andThen(divison).accept(12,4);

        nameAndActivites();
    }

}
