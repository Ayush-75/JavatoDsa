package Oops;

public class MainClass {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.color = "Black";
        d1.age = 2;
        d1.name = "Ballo";
        d1.walk();

        Complex num = new Complex();
        num.a = 5;
        num.b = 7;
        num.print();
    }
}

class Complex{
    int a,b;
    void print(){
        System.out.println(a+"+"+b+"i");
    }
}
class Dog{
    String name;
    String color;
    int age;

    void walk(){
        System.out.println(name+" Dog is walking");
    }


}

class Cat{}
