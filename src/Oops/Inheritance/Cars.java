package Oops.Inheritance;

public class Cars extends Vehicle {

    public static void main(String[] args) {


        // its own property
        String color;

        Cars obj = new Cars();
        // overriding wheels count
        //by default it will be 4
        obj.wheelsCount = 2;
        obj.model = "Velar";
        obj.start();
        System.out.println(obj.wheelsCount);
        obj.mileage(25);
        obj.mileage(35);
    }

    Cars(){
        // calling user created constructor
        // while passing wheelsCount
        super(4);
        // this or super has to first statement in constructor body,
        // so you can use one at a time
//        this(3)
        System.out.println("Car is being is created");
    }

    Cars(int wheels){

    }

    //creating your
    void start() {
        // parent implementation
        Scooter scooter = new Scooter();
        scooter.breaking(this);
        super.start();
        System.out.println(this.model+" Car is started");
    }

    //cannot override final method
//    void mileage(){}

    Cars Breaking(){
        return this;
    }
}

class Scooter {

    void breaking(Cars cars){
        System.out.println(cars.model+" is breaking");
    }
}