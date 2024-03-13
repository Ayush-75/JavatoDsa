package loops;

public class Nested_Loop {
    public static void main(String[] args) {

        for (int count = 1 ; count<=10;count++){
            for (int i=1; i<=5;i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
