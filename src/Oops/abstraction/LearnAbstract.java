package Oops.abstraction;

public class LearnAbstract {
    public static void main(String[] args) {
        Cars c1 = new Cars();
        c1.accelerate();
        c1.brakes(4);
        c1.honks();
    }
}
// abstract method inside non-abstract class is not allowed
// abstract method can have regular method or abstract method
abstract class MovingVehicle{

    // abstract method doesn't have body
    // its has to be implemented if class is extended
    abstract void accelerate();

    abstract int  brakes(int wheels);

    // its normal method its not necessary to implement it
    void honks(){
        System.out.println("Vehicle honks");
    }
}

class Scooter extends MovingVehicle{
    @Override
    void accelerate() {

    }

    @Override
    int brakes(int wheels) {
        return 0;
    }
}

class Cars extends MovingVehicle{
    @Override
    int brakes(int wheels) {
        return wheels;
    }

    @Override
    void accelerate() {
        System.out.println("car is Accelerating");
    }

    @Override
    void honks() {
        System.out.println("Cars honks");
    }
}
