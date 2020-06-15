package io.gd.study.challenge6.calllkotlinfromjava;

import io.gd.study.challenge6.kotlincode.Challenge;
import io.gd.study.challenge6.kotlincode.Employee;
import io.gd.study.challenge6.kotlincode.KotlinStuff;

public class Main {
    public static void main(String[] args) {
//        KotlinStuff.sayHelloToJava("Student");
//
//        Employee employee = new Employee("John", "Smith", 2010);
//        employee.startYear = 2009;
//
//        Challenge.doMath(5, 4);
//
//        employee.takesDefault("arg1");

        KotlinStuff.sayHelloToJava("Student");

        Employee employee = new Employee("John", "Smith", 2010);
        employee.setStartYear(2009);

        Challenge.INSTANCE.doMath(5, 4);

//        employee.takesDefault(null);
    }
}
