package user_input;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
/*
        System.out.println("Enter you age");
        int age = sc.nextInt();
        System.out.println("Your age is "+age);*/

        System.out.println("Enter number one");
        int firstNumber = sc.nextInt();
        System.out.println("Enter number Two");
        int secondNumber = sc.nextInt();

        System.out.println("Greater Number is "+Math.max(firstNumber, secondNumber));
        // its imp for garbage collection
        sc.close();
    }
}
