package Wrapper_Generics;

public class Wrapper_1 {

    public static void main(String[] args) {

        Integer obj = new Integer(12);

        // valueOf will convert the String value into int
        Integer obj1 = Integer.valueOf("12");
        System.out.println(obj1*2);
        // it will not throw error
        Boolean b = Boolean.valueOf("True");
        Integer obj2 = 12; // Autoboxing

        int age = obj2; // unboxing
    }
}
