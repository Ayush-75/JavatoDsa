package function_methods;

public class Method {

    public static int x = 10;
    public static void main(String[] args) {

        int what = new  Method().addition(5,7);
        System.out.println(what);

        average(5,7);

        int x = 5;
        nw();
        System.out.println(x);
    }

    int addition(int a , int b){
        return a+b;
    }

    static void average(int a,int b){
        int avg = (a+b)/2;
        System.out.println(avg);
    }

    static void nw(){
        System.out.println(x);
    }

}
