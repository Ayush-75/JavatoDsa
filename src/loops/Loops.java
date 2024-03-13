package loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // we use forloop when we already know no. of loop iteration
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

//        for (int i=1; i<=10;i++){
//            System.out.println(n+"*"+i+"="+i*n);
//        }

        // sum of natural numbers
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);

        // sum of even a number sum

        int sumEven = 0;
        for (int i = 1; i <= n; i++) {
            sumEven += i*2;
        }
        System.out.println("sum of even number of " + n + " is "+ sumEven);

    }
}
