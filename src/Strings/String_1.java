package Strings;

public class String_1 {

    public static void main(String[] args) {
        // its case-sensitive

        String name = "Ayush";
        String SameName = "Ayush"; //
        String NewName = new String("AyusH"); // in heap memory new reference
        System.out.println("Ayush"); // in string pool

        /**
         This distinction exists because in Java, non-primitive types (objects) are stored in the heap memory,
         and variables of these types only store a reference (address) to the actual object in the heap.
         When you compare objects using ==, you are comparing these references
         (i.e., whether the two variables point to the exact same object).

         In contrast, primitive types are stored directly in memory (on the stack),
         so their == comparison is simpler and compares their actual values.
         */

        // java is case-sensitive so Ayush and AYUSH are different
        // Using == to compare references, not values and String is an object
        // but during primitive data type its check values


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
