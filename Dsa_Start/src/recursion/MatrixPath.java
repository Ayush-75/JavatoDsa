package recursion;

public class MatrixPath {

    public static void main(String[] args) {

        System.out.println(ways(3,3));
    }

    static int ways(int m,int n){
        if (m==1 || n ==1) return 1;
        return ways(m,n-1) + ways(m-1,n);
    }
}
