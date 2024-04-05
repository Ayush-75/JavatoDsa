package Oops.Polymorphism;


class Data {
    int data;

    void printData() {
        System.out.println(data);
    }

    void printData(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(data);
        }
    }
}

public class Poly extends Data {

    @Override
    void printData() {
        System.out.println("overridden " + data);
    }

    void childMethod(){
        System.out.println("child Method");
    }
}

class LearnPoly {

    public static void main(String[] args) {

        // if you this way you will only get data class method and variable
        // you will not get Poly class method
//        d.childMethod()
        Data d = new Poly();
        // so do it like this
        Poly p = new Poly();
        p.childMethod();
        d.printData(); //runtime polymorphism aka method overriding

        d.printData(2); // compile time polymorphism aka method overloading
    }
}
