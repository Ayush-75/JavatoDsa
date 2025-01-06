package collection_framework.comparator_comparable;

import java.util.Arrays;
import java.util.Comparator;

public class Comparator_1 {
    public static void main(String[] args) {

        int[][] a = {
                {5,7,8},
                {1,6,3},
                {1,4,3},
                {1,5,3},
                {2,3,4},
                {3,3,4},
                {4,3,4}
        };

//        Arrays.sort(a, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return 0;
//            }
//        });

        // Sort each sub-array
        for (int[] subArray : a) {
            Arrays.sort(subArray);
        }

        Arrays.sort(a,(a1,a2) -> {
            if (a1[0] == a2[0]){
                return a1[1] - a2[1];
            }
            return a1[0] - a2[0];
        });



        for (int[] s :a){
            for (int element:s){
                System.out.print(element+" ");
            }
            System.out.println();
        }

    }
}
