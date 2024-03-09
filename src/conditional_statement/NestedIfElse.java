package conditional_statement;

public class NestedIfElse {

    public static void main(String[] args) {
        int a = 55000;
        int b = 250000;
        int c = 350000;
        int d = 5050000;

        // not recommended just for practice
      /*  if (a > b) {
            System.out.println("a is bigger than b");

            if (a > c) {
                System.out.println("a is bigger than c");
//                System.out.println("a is largest number " + a);
            }
            if (a > d) {
                System.out.println("a is bigger than d");
                System.out.println("a is largest number " + a);
            } else {
                System.out.println("d is bigger than a");
            }
        }

         else if (b > c) {
            System.out.println("b is bigger than c");
//            System.out.println("biggest number is b " + b);

            if (b > d) {
                System.out.println("b is bigger than d");
                System.out.println("b is largest number " + b);
            } else {
                System.out.println("d is bigger than b");
                System.out.println("d is largest number " + d);
            }
        }
        else{
            System.out.println("c is bigger than b");
            if (c>d){
                System.out.println("c is bigger than d");
                System.out.println("c is largest number "+c);
            }
            else {
                System.out.println("d is bigger than c");
                System.out.println("d is largest number "+ d);
            }

        }*/

        // optimized way with ternary operator
        int max = (a > b && a > c && a > d) ? a : (b > c && b > d) ? b : (c > d) ? c : d;
        System.out.println(max);
    }
}


