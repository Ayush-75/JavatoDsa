package Arrays;

public class Array_1 {
    public static void main(String[] args) {
        int [] age = new int[]{10,20,70,80};
        int [] marks = {98,58,70,88};
        String [] name = {"ayush", "ufc", "Axe","golu"};

      for (int i=0;i<age.length;i++){
          System.out.println(age[i]);
      }

        System.out.println("---------");
      // for each
      for (int i : age){
          System.out.println(i);
      }
    }
}
