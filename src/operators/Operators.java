package operators;

import java.awt.image.Kernel;

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

        int i = 5;
        int j = 77;
        int k = 88;
        int l = 75;

        int max = (i > j) ? i : (i > k) ? i : (j > k) ? j : k;
        System.out.println(max);

    }
}
