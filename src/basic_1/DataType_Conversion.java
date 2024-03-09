package basic_1;

public class DataType_Conversion {

    public static void main(String[] args) {

    //implicit conversion
        int count = 20;
        long countLong = count;

    //explicit conversion

        long bigNumber = 12124;
        int smallInt = (int) bigNumber;

        int age = 128;
        // casting int in byte
        byte newAge = (byte) age; // range of byte -128 to 127
        // rotating in range byte range
        System.out.println(newAge);

    }



}
