package function_methods;

public class Math_method {
    public static void main(String[] args) {


        System.out.println(Math.min(5, 7));
        System.out.println(Math.max(5, 7));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.pow(5, 2));
        System.out.println(Math.random()); // return the value from 0 to 1

        System.out.println(getRandom(10, 20));

        //The abs() method returns the absolute (positive) value of a number.
        System.out.println(Math.abs(-7));

        // floor() method rounds a number DOWN to the nearest integer
        System.out.println(Math.floor(7.9));
        //ceil() method rounds a number rounded UP to the nearest integer
        System.out.println(Math.ceil(7.1));
        System.out.println(Math.round(7.5));
    }

    static int getRandom(int a, int b) {
        // the range of random is 1 to 10
//        return (int) (Math.random() * 10) +1;

        // custom range with parameter
        return (int) (Math.random() * ((b - a) + 1) + a);
    }
}
