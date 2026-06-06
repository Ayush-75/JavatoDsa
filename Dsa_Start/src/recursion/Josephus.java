package recursion;

public class Josephus {

    public static void main(String[] args) {
        System.out.println(jose(3,2));
    }

        public static int jose(int n, int k)
        {
            if (n == 1)
                return 1;
            else
                return (jose(n - 1, k) + k-1) % n + 1;
        }

}
