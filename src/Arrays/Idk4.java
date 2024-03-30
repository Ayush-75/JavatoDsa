package Arrays;

public class Idk4 {
    public static void main(String[] args) {
        /*
        * The contains(CharSequence sequence) method checks
        * if the string contains the specified character sequence. In this case,
        * an empty string "" is considered to be present in any string, so the method returns true.*/
        String str = "Java";
        System.out.println(str.contains(""));
        /*The contains(CharSequence sequence) method checks if the string contains the specified character sequence. In this case,
        the sequence provided is null and the contains method gives a NullPointerException if the argument is passed as null.*/
        System.out.println(str.contains(null));
    }
}
