package exception_handling;

public class Try_Catch {

    public static void main(String[] args) {

        int[] i = new int[5];

        try {
            int result = 5/0;
            System.out.println(i[6]);
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Handling exception");
        }
//        catch (Exception e){
//            System.out.println("all exception handle");
//        }
    }
}
