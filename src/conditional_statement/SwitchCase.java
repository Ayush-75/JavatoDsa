package conditional_statement;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        /*
        The switch statement in Java only accepts expressions of type int,
         char, byte, short, and String.
         The switch statement doesn't accept arguments of type long,
         float, double, boolean, or any object besides String
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Are you Drunk");
        }
    }
}
