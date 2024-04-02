package Oops.Encapsulation;

public class Person {

    private int age;
    private String name;

    boolean canBeChanged = true;

    void setAge(int age){
        if (canBeChanged) {
            if (age>0) {
                this.age = age;
            }
        }
    }

    boolean canBeAccessed = false;

    int getAge(){
        if (canBeAccessed) return age;
        return -1;
    }
}
