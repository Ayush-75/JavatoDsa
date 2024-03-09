package conditional_statement;

import java.util.Scanner;

public class IfElse {


    public static void main(String[] args) {
        System.out.println("whats your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("You can vote");
        }
        else if (age == 55){
            System.out.println("you are good brother");
        }
        else if (age == 18){
            System.out.println("don't lie brother");
        }

        else {
            System.out.println("you cannot vote");
        }
    }
}