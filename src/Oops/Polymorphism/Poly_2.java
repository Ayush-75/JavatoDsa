package Oops.Polymorphism;

public class Poly_2 {

    public static void main(String[] args) {

        Invoke invoke = new Invoke(5,7);
        Invoke invoke1 = new Invoke(1,2);

        Invoke add = invoke.add(invoke1);
        add.print();
    }
}

class Invoke{

    int a,b;
    public Invoke(int a,int b){
        this.a = a;
        this.b = b;
    }

    void print(){
        System.out.println(a+"+"+b+"i");
    }

    Invoke add(Invoke o){
        System.out.println(this);
        this.print();
        o.print();
        return new Invoke(a+o.a,b+o.b);
    }
}
