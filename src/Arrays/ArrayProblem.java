package Arrays;

public class ArrayProblem {

    public static void main(String[] args) {
        int[] numbers = {10, 2, 35, 4, 55, 6, 7, 8, 90, 10};

        int sum = 0;
        for (int i :
                numbers) {
            sum += i;
        }
        System.out.println(sum);

        int mum = 0;
        for (int i = 0; i < numbers.length; i++) {
            mum += numbers[i];

        }
        System.out.println(mum);

        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("smallest number in array is  " + min);


        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("biggest number in array is " + max);

    }
}
