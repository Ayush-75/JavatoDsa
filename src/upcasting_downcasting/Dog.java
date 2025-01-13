package upcasting_downcasting;

public class Dog extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("dog class wof wof");
    }

    public void growl(){
        System.out.println("Grrrrr");
    }
}
