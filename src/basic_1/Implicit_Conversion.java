package basic_1;

public class Implicit_Conversion {

    public static void main(String[] args) {
//  Numeric Promotion

        byte b = 10;
        int i = b; // Implicit conversion from byte to int
        long l = i; // Implicit conversion from int to long
        float f = l; // Implicit conversion from long to float
        double d = f; // Implicit conversion from float to double


  //Boolean Conversion

        int x = 5;
        boolean m = (x != 0); // Explicit comparison

        boolean n = (x == 0) ? false : true; // Ternary operator


  //Character Conversion

        char c = 'A';
        int t = c; // Implicit conversion from char to int (Unicode value of 'A' is 65)
        double j = c; // Implicit conversion from char to double (Unicode value of 'A' is 65.0)


  //String Conversion

        int k = 42;
        String s = x + ""; // Implicit conversion from int to String
        double p = 3.14;
        String s2 = d + ""; // Implicit conversion from double to String

    }
}
