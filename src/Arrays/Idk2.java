package Arrays;

public class Idk2 {
    public static void main(String[] args) {
        int[][] Matrix = new int[3][3];
        int value = 1;

        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                Matrix[i][j] = value;
                value++;
            }
        }

        int sum = 0;
        for (int[] i : Matrix) {
            for (int num : i) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
