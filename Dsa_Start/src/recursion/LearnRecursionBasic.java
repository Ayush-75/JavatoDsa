package recursion;

public class LearnRecursionBasic {

    public static void main(String[] args) {

//        fun(4);
//        foo(4);
        bar(3);

//        System.out.println(sumOf(5));

//        System.out.println(fibOfN(1));
    }

    static void fun(int n) {
        if (n > 0) {
            System.out.println(n);
            fun(n - 1);
        }
    }

    static void foo(int n) {
        if (n > 0) {
            foo(n - 1);
            System.out.println(n);
        }
    }

    // tree recursion

    static void bar(int n){
        if (n > 0){
            System.out.println(n);
            bar(n-1);
            bar(n-1);
        }
    }

    // factorial

    static int sumOf(int n){
        if (n == 1) return 1;
        return sumOf(n-1) + n;
    }

    // fibonacci series

    static int fibOfN(int n){
        if (n <= 1) return n;
        return fibOfN(n-1) + fibOfN(n-2);
    }
}
