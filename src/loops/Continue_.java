package loops;

public class Continue_ {

    public static void main(String[] args) {
        // it will skip the condition which is true and jump to the next iteration

        for (int i =0;i<=20;i+=1){
            if (i ==2 || i==10 )continue;
            if (i>=15)break;
            System.out.println("gave toffee to "+i);
        }
    }
}
