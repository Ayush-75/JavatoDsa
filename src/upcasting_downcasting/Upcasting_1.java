package upcasting_downcasting;

public class Upcasting_1 {

    public static void main(String[] args) {

        // Upcasting: Dog object is being referenced by an Animal reference
        Animal myAnimal = new Dog();
        doAnimalStuff(myAnimal);
    }

    public static void doAnimalStuff(Animal animal){
        // Calling the makeNoise method of the Animal
        animal.makeNoise();
        // animal.growl(); // we can't call this because growl is not defined in Animal class
    }
}

/**
 * Upcasting is the process of converting a subclass reference (in this case, `Dog`)
 * to a superclass reference (in this case, `Animal`).
 *
 * **Use cases of upcasting:**
 * - When you want to treat objects of different subclasses uniformly.
 * - When you want to store different subclass objects in a single collection.
 * - When you want to pass subclass objects to a method that accepts superclass objects.
 *
 * **Things to take care of:**
 * - Upcasting is safe and does not require explicit casting.
 * - You can only access the methods and fields that are defined in the superclass.
 * - Subclass-specific methods and fields are not accessible through the superclass reference.
 */