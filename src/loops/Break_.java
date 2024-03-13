package loops;

public class Break_ {
    // it will exit the loop if the condition is true or break the loop
    public static void main(String[] args) {

        for (int i = 0; i<=10;i+=2){
            if (i == 6) break;
            System.out.println(i);
        }
    }
}
