package patterns;

public class Star {
    public static void main(String[] args) {

        for (int count = 1;count<=5;count++){
            for (int i = 1; i<=count;i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }


//        int count = 1;
//        while (count<=5){
//            int i = 1;
//            while (i<=count){
//                System.out.print(i+" ");
//                i++;
//            }
//            count++;
//            System.out.println();
//        }
    }
}
