package Arrays;

import java.util.Arrays;

public class Sorted_Array {
    public static void main(String[] args) {

        int[][] numbers = {
                {5,1,3},
                {4,7,9},
                {2,6,10}
        };

        int rows = numbers.length;
        int cols = numbers[0].length;
        System.out.println("rows length: "+rows + " column length: "+cols +" total length " + rows*cols);
        int[] flattenArray = new int[rows*cols];
        int index = 0;
//
//        for (int[] number : numbers) {
//            for (int i : number) {
//                flattenArray[index++] = i;
//            }
//        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                flattenArray[index++] = numbers[i][j];
            }
        }

        Arrays.sort(flattenArray);

        for (int i :flattenArray){
            System.out.print(i+" ");
        }

        System.out.println();

        int[][] sortedArray = new int[rows][cols];
        for (int i = 0; i < flattenArray.length; i++) {
            sortedArray[i/cols][i%cols] =flattenArray[i];
        }

        for (int[] i:sortedArray){
            for (int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
