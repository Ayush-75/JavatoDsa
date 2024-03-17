package Strings;

import java.util.Scanner;

public class String_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstname = sc.nextLine();

        System.out.println("Enter your last name");
        String lastname = sc.next();

        System.out.println("Your full name is "+firstname+" "+lastname);
    }
}
