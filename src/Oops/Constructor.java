package Oops;

public class Constructor {

    public static void main(String[] args) {

        DefaultCons defaultCons1 = new DefaultCons(5,7);
        DefaultCons defaultCons2 = new DefaultCons(3,5);
        DefaultCons defaultCons3 = new DefaultCons(3);
        defaultCons1.print();
        defaultCons2.print();
        defaultCons3.print();
        System.out.println("adding two numbers");
        DefaultCons result = defaultCons1.add(defaultCons2);
        System.out.println(defaultCons2);
        result.print();
    }
}

class DefaultCons{

    // Default constructor created by compiler
    // this keyword lets you access a current object parameter or behavior
    public DefaultCons(int a, int b){
        this.a= a;
        this.b = b;
    }

    // constructor overloading
    public DefaultCons(int real){
        a = real;
        b = 12;
    }

    int a,b;
    void print(){
        System.out.println(a+"+"+b+"i");
    }

    // this keyword stores current object reference
    DefaultCons add(DefaultCons num1){
        System.out.println(this);
        this.print();
        num1.print();
        return new DefaultCons(a+ num1.a,b+ num1.b);
    }
}
