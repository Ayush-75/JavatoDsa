package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        // you use while loop when you don't know the number of iterations
        // it will keep running until the condition is not true

        /*
        * for loops are used when the number of iterations is known,
        * while loops are used when the number of iterations is not known*/

        Scanner sc = new Scanner(System.in);
        boolean hasLearned = false;

        while (!hasLearned){
            System.out.println("Have you learned");
            System.out.println("Concept is clear");
            hasLearned = sc.nextBoolean();
            if (hasLearned==true) {
                System.out.println("ok good");
            }else {
                System.out.println("try again");
            }

        }
    }
}
