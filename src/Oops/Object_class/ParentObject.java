package Oops.Object_class;

import Oops.Inheritance.Cars;

public class ParentObject {
    public static void main(String[] args) {
        Car car  = new Car("Velar",2024);
        Car car2  = new Car("Velar",2024);

        System.out.println(car.equals(car2));

        System.out.println(car.toString());
        // by default, it will return this -> Oops.Object_class.Car@4e50df2e ->
        // this is an object reference, but
        //  you can override toString method
    }
}

class Car {

    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // overriding toString method of this class
//    @Override
//    public String toString() {
//        return "Car model "+model+" and year is "+year;
//    }

    // overriding equals method
    @Override
    public boolean equals(Object obj) {
        // typecast
        Car that = (Car) obj;
        if (this.model.equals(this.model) && this.year == this.year) {
            return true;
        }
        return false;

    }
}
