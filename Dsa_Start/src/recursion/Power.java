package recursion;

public class Power {
    public static void main(String[] args) {

        System.out.println(power(5, 3));
        System.out.println(powerRecursion(5, 3));

        int a = -5;
        int b = 3;
        int res = powerRecursion(Math.abs(a), b);
        if (a < 0) res = -res;
        System.out.println(res);

        System.out.println(fastPower(5, 3));
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int powerRecursion(int a, int b) {
        if (b == 0) return 1;
        return power(a, b - 1) * a;
    }

    // fast power
    // doing it with logarithmic way

    static int fastPower(int a, int b) {
        if (b == 0) return 1;
        if (a % 2 == 0) return fastPower((a * a), b / 2);
        return a * fastPower(a, b - 1);
    }


}
