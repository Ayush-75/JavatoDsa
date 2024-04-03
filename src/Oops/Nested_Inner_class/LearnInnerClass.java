package Oops.Nested_Inner_class;

import Oops.abstraction.LearnAbstract;

public class LearnInnerClass {

    int age;
    // inner class

    class Toy{
        int price;
        void access(){
            age = 50;
            System.out.println(age);
        }

    }

    // nested static class
    static class PlayStation{
        int price;

    }

    public static void main(String[] args) {


//        Toy toy = new LearnInnerClass().new Toy();
        LearnInnerClass obj = new LearnInnerClass();
        Toy toy = obj.new Toy();
        toy.price = 55;
        toy.access();
        System.out.println(obj.age);
        PlayStation  playStation = new LearnInnerClass.PlayStation();
        playStation.price = 55000;
    }
}
