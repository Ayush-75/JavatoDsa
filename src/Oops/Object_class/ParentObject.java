package Oops.Object_class;

import Oops.Inheritance.Cars;

import java.util.Objects;

public class ParentObject {
    public static void main(String[] args) {
        Car car  = new Car("Velar",2024);
        Car car2  = new Car("Velar",2024);

        System.out.println(car.equals(car2));

        System.out.println(car.toString());
        // by default, it will return this -> Oops.Object_class.Car@4e50df2e ->
        // this is an object reference, but
        //  you can override toString method

        System.out.println(car.hashCode());
        System.out.println(car2.hashCode());
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

    // intellij generated equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(model, car.model);
    }
//
// A Java method overriding the default hashCode method to use model and year for hashing.
    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }


    // custom hashCode method
//    @Override
//    public int hashCode() {
//        int initialNumber = 24;
//        initialNumber+=year;
//        initialNumber+=model.hashCode();
//        return initialNumber;
//    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    // overriding equals method we created it
//    @Override
//    public boolean equals(Object obj) {
//        // typecast
//        Car that = (Car) obj;
//        if (this.model.equals(this.model) && this.year == this.year) {
//            return true;
//        }
//        return false;
//
//    }
}
