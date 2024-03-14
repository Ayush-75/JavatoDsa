package loops;

public class Label_Break {

    public static void main(String[] args) {

        outerLoop:
        for (int count = 1; count<=5;count++){
            for (int i = 1;i<=count;i++){
//                if (i==3) continue outerLoop;
                if (i==3) break outerLoop;
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
