package Oops.Interface;

public class LearnInterface {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.eats();
        monkey.sings();
        monkey.drinks();
        monkey.walk();
        System.out.println(Animal.i);


    }

}
interface Pet{
    void sings();
    void drinks();
    default void walk(){
        System.out.println("Animal is walking");
    }
}

interface Animal{

    // by default, all fields are implicitly public static final
    public static final int i = 5;

    // by default, all methods are abstract
    //all methods inside interface is implicitly public
    void eats();

    void drinks();

    // default function no need to override in every class
    // if users want it can override
    default void walk(){
        System.out.println("Animal is walking");
    }
}

class Monkey implements Animal,Pet{
    @Override
    public void eats() {
        System.out.println("Monkey is eating");
    }

    @Override
    public void sings() {
        System.out.println("Monkey can sings");
    }

    @Override
    public void drinks() {
        System.out.println("Monkey can drinks");
    }

    @Override
    public void walk() {
        Animal.super.walk();
    }
}
