package loops;

import java.util.Scanner;

public class WhileLoop_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no 1");
        int i = sc.nextInt();
        System.out.println("enter no 2");
        int number = sc.nextInt();
//        if (i <= number) {

            while (i <= number) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
                i++;
            }
//        } else
//            System.out.println("enter proper number");
    }
}
