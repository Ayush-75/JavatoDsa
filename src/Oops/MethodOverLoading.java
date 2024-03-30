package Oops;

import java.util.Scanner;

public class MethodOverLoading {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Greets ob1 = new Greets();
        System.out.println("Enter your name");
        String name = sc.nextLine();
        ob1.greetings(name,5);
        ob1.greetings();
    }

}

class Greets{
    void greetings(){
        System.out.println("Hello, Good morning");
    }

    void greetings(String name){
        System.out.println("Hello "+ name+" Good Morning");
    }

    void greetings(String name, int count){
        for (int i=1; i<= count;i++) {
            System.out.println("Hello "+ name+" Good Morning "+ i + "time");
        }


    }
}
