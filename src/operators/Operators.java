package operators;

import java.awt.image.Kernel;
import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {

        // Arithmetic operators
        int a = 20;
        int b = 15;
        int c = a + b;
        int d = a - b;
        double e = (double) a / b;
        double f = a % b;
        System.out.println(f);
        System.out.println(e);

        // Assignment operator (=)
        a += b; // a =a+b
        a -= b; // a = a-b
        a *= b; // a = a*b
        a /= b; // a = a/b
        a %= b; // a = a%b

        // relational operator -> always return boolean value (true/false)
        // (==) -> is Equal To

        // (!=) -> Not Equal to

        // (>) -> greater than

        // (<) -> less than

        // (>=) -> Greater than & equal to

        // (<=) -> less than & equal to

        // Logic Operator -> (AND) = && , (OR) = || , (NOT) = ! , (0 -> false, 1 -> true)

        boolean firstExpression = false;
        boolean secondExpression = true;

        System.out.println(firstExpression && secondExpression);
        System.out.println(firstExpression || secondExpression);
        System.out.println(!firstExpression);
        System.out.println(!secondExpression);

        // bitwise Operators


        // increment operator and decrement operator

        // ++

        int aa = 12;
        aa++;
        System.out.println(aa);

        //--
        // a value is 13 now
        aa--;
        System.out.println(aa);

        // Ternary operator
        // ?: -> if else

//        Scanner sc = new Scanner(System.in);
        int i = 80;
        int j = 6000000 ;
        int k =70000;
        int l = 90;

        int max = (i > j) ? ((i > k) ? i : k) : (j > k) ? j : k;
        System.out.println("max : "+max);

        int tax= (i > j) ? (i > k ? (i > l ? i : l) : (k > l ? k : l)) : (j > k ? (j > l ? j : l) : (k > l ? k : l));

        System.out.println("tax :"+tax);

        int kax  = (i>j && i>k && i>l)?i:(j>k && j>l)?j:(k>l)?k:l;
        System.out.println("kax : "+kax);

        int mat = (int) Math.max((Math.max(i,j)),Math.max(k,l));
        System.out.println("Mat : "+mat);

    }
}
