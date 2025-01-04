package exception_handling;

import java.util.Scanner;

public class Custom_Exception {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age");
        try {
            int age = sc.nextInt();
            if (age>100){
                throw new MyException("More than 100 is not allowed");
            }
        }catch (Exception e){
            System.out.println("caught exception "+e.getMessage());
        }
    }
}

class MyException extends Exception{

    public MyException(String message){
        super(message);
    }
}
