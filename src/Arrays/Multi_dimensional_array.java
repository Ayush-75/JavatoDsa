package Arrays;

public class Multi_dimensional_array {
    public static void main(String[] args) {


        int[][] mark = new int[3][4];
        // index - 0  

        int[][] marks = {
                {12, 14, 55, 74},
                {22, 55, 88, 77},
                {55, 75, 88, 55}
        };
//        System.out.println(marks[2][3]);
        marks[0][1] =5;

        for (int[] i : marks) {
            for (int value : i) {
                System.out.println(value);
            }
            System.out.println();
        }
    }
}