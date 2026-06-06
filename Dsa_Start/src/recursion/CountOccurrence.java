package recursion;

public class CountOccurrence {

    public static void main(String[] args) {

        String s = "ababcaba";
        String t = "aba";

        System.out.println(countOccurrence(t,s,0));

    }

    static int countOccurrence(String t, String s, int i){
        if (i>s.length() - t.length()){
            return 0;
        }

        int subProblemKaAnswer = countOccurrence(t,s,i+1);
        boolean doStartingCharsMatch = s.substring(i,i+t.length()).equals(t);
        if (doStartingCharsMatch) return  subProblemKaAnswer + 1;
        else  return subProblemKaAnswer;
    }
}


