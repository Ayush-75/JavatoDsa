package upcasting_downcasting;

public class DownCasting_1 {
    public static void main(String[] args) {

        // Creating an Animal reference to a Cat object
        Animal animal = new Cat();
        // Creating an Animal reference to a Dog object
        Animal animal2 = new Dog();
        // Passing the Dog object to the method
        doAnimalStuff(animal2);

    }

    // Method to perform actions on Animal objects
    public static void doAnimalStuff(Animal animal){
        // Calling the makeNoise method of the Animal
        animal.makeNoise();
        // Checking if the Animal is an instance of Dog
        if (animal instanceof Dog){
            // Downcasting Animal to Dog
            Dog myDog = (Dog) animal;
            // Calling the growl method of the Dog
            myDog.growl();
        }
    }
}
/**


Downcasting is the process of converting a superclass reference (in this case, `Animal`)
 to a subclass reference (in this case, `Dog`).
 This is useful when you need to access subclass-specific methods that are not available in the superclass.

**Use cases of downcasting:**
        - When you need to call methods that are specific to the subclass.
        - When you need to access subclass-specific fields.

        **Things to take care of:**
        - Always use the `instanceof` operator to check the actual
 type before downcasting to avoid `ClassCastException`.
        - Ensure that the object being downcasted is actually an instance of the subclass.
*/
