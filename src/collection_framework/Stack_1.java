package collection_framework;

import java.util.Stack;

public class Stack_1 {
    public static void main(String[] args) {
        Stack<String> words = new Stack<>();
        words.push("Ayush");
        words.push("KO");
        words.push("Jones");
        words.push("Floyd");
        words.push("Carry");

        System.out.println(words.pop());
        System.out.println(words);
        System.out.println(words.pop());
        System.out.println(words.peek());
        System.out.println(words.empty());
    }
}
