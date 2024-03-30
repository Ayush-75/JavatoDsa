package Strings;

import java.util.Locale;

public class Strings_3 {
    public static void main(String[] args) {


        // its creating new String

        String name = "  ayush";
        System.out.println(name.toUpperCase());
        String name2 = "Ayush Shrivastava ";
        System.out.println(name2.toLowerCase());
        System.out.println(name2.trim());
        System.out.println(name2.startsWith("A"));
        System.out.println(name2.endsWith("A"));
        System.out.println(name2.charAt(3));

        System.out.println("================================================");

        int age = 24;
        System.out.println(age*2);
        String stringAge = String.valueOf(age);
        System.out.println(stringAge+2); // 242 concatenate

        // replace
        String sentence = "I love java, is good language";
        String newSentence = sentence.replace("java","Kotlin");
        System.out.println(newSentence);

        // check return boolean
        System.out.println(sentence.contains("Kotlin"));

        String subString = newSentence.substring(2,11); // 2-inclusive and 11-exclusive
        String subString2 = newSentence.substring(2); // it will print all after index 2
        System.out.println(subString);
        System.out.println(subString2);

        System.out.println("========================================================");

        // it will split word on the basis of regex input and stored it in an array
        // a will not print its split
        String  words[] = sentence.split("a");
        for (String i : words){
            System.out.println(i);
        }
        System.out.println("=========================================================");

        String[] wordsComma = sentence.split(",");
        for (String i : wordsComma){
            System.out.println(i);
        }

        System.out.println("===========================================================");

        // it will convert all strings in a character array
        // if you want to store String in a character array
        // space will be also included

        String color = "Brown berries cake";
        char letters[] = color.toCharArray();
        for (char letter:letters){
            System.out.println(letter);
        }

        System.out.println("=================================================");

        // check if String is empty
        String animal = "    ";
        if (animal.isEmpty()){
            System.out.println("Empty");
        }else if (animal.isBlank()) {
            System.out.println("is blank");
        }

        System.out.println("============================");
        //Returns true if the string is empty or contains only white space codepoints, otherwise false.
        String human = "          ";
        if (human.isBlank()){
            System.out.println("is blank");
        }
    }
}
