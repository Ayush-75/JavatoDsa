package user_input;

import java.util.Scanner;

public class Phil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        while (true) {
            System.out.println("Enter first number");
            a = sc.nextInt();
            System.out.println("Enter second number");
            b = sc.nextInt();

            if (a < b) {
                break;
            } else {
                System.out.println("Enter proper number (first number should be less than second number)");
            }
        }

        while (a <= b) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a++;
        }
    }
}