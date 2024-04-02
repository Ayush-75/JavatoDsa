package Oops.Inheritance;

public class Vehicle {

    //variable with final keyword cannot be reassigned
    // you need to assign right here while declaring it
    // no default value will be assigned
    final int gears = 5;

    final void mileage(int mileageInKm){
        System.out.println("Mileage of car is "+ mileageInKm +"Km");
    }



    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
//        vehicle.gears = 5;
    }

    public Vehicle(){
        System.out.println("Creating a vehicle Instance");
    }

    Vehicle(int wheelsCount){
        this.wheelsCount = wheelsCount;
        System.out.println("Creating vehicle with wheels");
    }
    int wheelsCount;

    String model;
     void start(){
         System.out.println("Vehicle starting");
     }
}
