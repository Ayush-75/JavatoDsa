package Strings;

public class String_1 {

    public static void main(String[] args) {
        // its case-sensitive

        String name = "Ayush";
        String SameName = "Ayush"; //
        String NewName = new String("AyusH"); // in heap memory new reference
        System.out.println("Ayush"); // in string pool

        if (name == SameName) { // checks reference
            System.out.println("Both are same");
        }

        if (name == NewName) {
            System.out.println("both are same");
        } else
            System.out.println("both are not same");


        if (name.equals(NewName)){ // it will check values
            System.out.println("Both values are same");
        }
        else System.out.println("Not same values");

        if (name.equalsIgnoreCase(NewName)){ // it will check values
            System.out.println("Both values are same with Ignore case");
        }
        else System.out.println("Not same values");

    }
}
