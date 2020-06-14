package io.gd.study.callkotlinfromjava;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StaticCar.topLevel();

        StaticCar.print("print this Java string");

        Car car = new Car("blue", "BMW", 2011, true);
//        System.out.println(car.getModel());
//        car.setColor("purple");
        System.out.println(car.getColor());
        System.out.println(car.isAutomatic());
        car.setAutomatic(false);

        System.out.println(car.model);

//        Car.Companion.carComp();
        Car.carComp();

        SingletonObj.doSomething();
        System.out.println("isAuto = " + Car.isAuto);
        System.out.println("const = " + Car.constant);

//        car.printMe(null);

        try {
            StaticCar.doIO();
        } catch (IOException e) {
            System.out.println("IOException!");
        }

        StaticCar.defaultArgs("The Number is: ");
        StaticCar.defaultArgs("The Number is: ", 10);
    }
}