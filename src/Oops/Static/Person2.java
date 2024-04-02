package Oops.Static;

public class Person2 {

    static int count = 0;
    // make final so the value cannot be changed in future or any other class
    // variable value is universal
    static final int countFinal = 0;

    Person2(){
        count++;
    }


    private int age;

    void setAge(int age){
        this.age = age;
    }

    int getAge(){
        return age;
    }
    private String name;

    public static void main(String[] args) {
        StaticUse.printHello();
    }
}
