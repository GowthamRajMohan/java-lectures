package io.smacs;

public class Car {

    int noOfTyres;
    String color;
    int noOfGear;

  //accessmodifier  return type   method Name
    public          void          drive() {
        System.out.println("I'm driving the car");
    }

    public int howManyTyres(){
        return noOfTyres;
    }
}
