package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subset {

    public static void main(String[] args) {

        String s = "abc";
        printAllSubsets(s, 0, "");
        System.out.println(findSubString(s, 0, ""));
        // ordered and avoided empty " "
        System.out.println(findSubstringO(s));
    }

    static void printAllSubsets(String s, int i, String cur) {
        if (i == s.length()) {
            System.out.println(cur);
            return;
        }
        printAllSubsets(s, i + 1, cur + s.charAt(i));
        printAllSubsets(s, i + 1, cur);
    }

    static List<String> findSubString(String s, int i, String cur) {

        if (i == s.length()) {
            List<String> result = new ArrayList<>();
            if (!cur.isEmpty()) {
                result.add(cur);
            }
            return result;
        }
        List<String> takeIt = findSubString(s, i + 1, cur + s.charAt(i));
        List<String> skipIt = findSubString(s, i + 1, cur);

        takeIt.addAll(skipIt);
        return takeIt;
    }


    static List<String> findSubstringO(String s) {
        List<String> substrings = new ArrayList<>();
        generateSubstrings(s, 0, new StringBuilder(), substrings);
        Collections.sort(substrings);
        return substrings;
    }

    static void generateSubstrings(String s, int index, StringBuilder current, List<String> substrings) {
        if (index == s.length()) {
            if (current.length() > 0) {
                substrings.add(current.toString());
            }
            return;
        }

        // Include the current character in the substring
        generateSubstrings(s, index + 1, current.append(s.charAt(index)), substrings);

        // Exclude the current character from the substring
        current.deleteCharAt(current.length() - 1); // Backtrack
        generateSubstrings(s, index + 1, current, substrings);
    }
}
