package no3_hashtables;

import java.util.HashSet;

public class No2_TwoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        HashSet<Character> firstSet = new HashSet<>();
        for(int i = 0; i < s1.length(); i++){
            firstSet.add(s1.charAt(i));
        }

        for(int j = 0; j < s2.length(); j++){
            if(firstSet.contains(s2.charAt(j))){
                return "YES";
            }
        }
        return "NO";
    }
}
