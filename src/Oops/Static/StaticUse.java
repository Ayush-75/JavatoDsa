package Oops.Static;

public class StaticUse {

    public static void printHello() {
        System.out.println("Hello");
    // you cannot call non-static Method inside static method
//        PrintHi();
    }

    // you can call static method inside non-static method
    void PrintHi() {
        System.out.println("Hi");
        printHello();
    }

    public static void main(String[] args) {

        // outside this class
//        StaticUse.printHello();
        printHello();
        System.out.println("From the Main Method");

        Person2 person2 = new Person2();
        Person2 person1 = new Person2();
        Person2 person3 = new Person2();
        // you can access static variable through object class,
        // but it's discouraged to use and not good practice
//        Person2.count = 5;
        System.out.println(person1.getAge());

        System.out.println(Person2.count);
        // this also static method
        System.out.println(Math.max(5,7));
    }

    // it will run before the main method
    static {
        System.out.println("From static Block");
    }
    static {
        System.out.println("From static Block 2 ");
    }

}
