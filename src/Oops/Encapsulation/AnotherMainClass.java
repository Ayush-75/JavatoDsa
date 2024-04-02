package Oops.Encapsulation;

import Oops.AccessModifier.Teacher; // importing another class instance

public class AnotherMainClass extends Teacher{
    public static void main(String[] args) {


        Teacher obj = new Teacher();
        obj.name = "Ayush";
        //Cannot be accessed from outside package
//        obj.degree = ""

        AnotherMainClass anotherMainClass = new AnotherMainClass();
        anotherMainClass.studentCount = 5;
    }
}
