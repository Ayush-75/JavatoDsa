package exception_handling;

public class Throws_1 {
    public static void main(String[] args) {

        int a[] = new int[5];
        try {

        getNumberFromArray(a);
        }catch (Exception e){
            System.out.println("caught the exception "+e.getMessage());
        }

    }

    static int getNumberFromArray(int a[]) throws ArithmeticException{
        return a[8];
    }
}
