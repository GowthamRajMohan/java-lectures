package io.smacs;

public class MainForCar {

    public static void main(String[] args) {
        Car ford = new Car();
        ford.noOfTyres = 4;
        ford.drive();
        System.out.println(ford.howManyTyres());
    }
}
