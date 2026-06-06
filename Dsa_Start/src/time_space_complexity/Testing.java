package time_space_complexity;

public class Testing {

    public static void main(String[] args) {


        int a[][] = {{5, 7, 8},
                {6, 5, 8, 6, 5},
                {1, 6, 8},
                {1, 7, 9},
        };

        for (int[] row:a){
            int n = row.length;

            for (int i=0;i<n-1;i++){
                for (int j=0;j<n-1-i;j++){
                    if (row[j] > row[j+1]){

                        // swap
                        int temp = row[j];
                        row[j] = row[j+1];
                        row[j+1] = temp;
                    }
                }
            }
        }

        for (int[] b : a) {
            for (int element : b) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
