package exception_handling;

public class Finally_ {

    public static void main(String[] args) {
        int[] i = new int[5];
        System.out.println("hello ");

        try {
            System.out.println(i[9]);
        }// their can be multiple catch block but finally block only one is allowed
        catch (Exception e) {
            System.out.println("Exception handle");
        }
        // we should use finally block for cleanup code like closing file or connection
        finally {
            System.out.println("I will print no matter i get exception or not");
        }
    }
}
