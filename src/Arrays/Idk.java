package Arrays;

public class Idk {
    public static void main(String[] args) {
        int[][] mark = new int[3][4];

// Fill the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                mark[i][j] = i + j;
            }
        }

        for (int i = 0; i < mark.length; i++) {
            for (int j = 0; j < mark[i].length; j++) {
                System.out.print(mark[i][j] + " ");
            }
            System.out.println();
        }
    }
}
