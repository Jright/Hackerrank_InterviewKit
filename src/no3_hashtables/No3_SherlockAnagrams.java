package no3_hashtables;

import java.util.*;

public class No3_SherlockAnagrams {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        int answer = 0;
        Hashtable<String, Integer> hashTable = new Hashtable<>();
        // Step 1. Get all of the substrings of String s. (The length of substring should be no more than a half of the total length,
        // otherwise it would be impossible to find another substring that has the same characters with the original substring)
        for(int i = 1; i < s.length(); i++){

            int j = 0;

            // The key point is to cut the String s in right way.
            while(i + j <= s.length()){
                String subString;
                if(j + i < s.length()){
                    subString = s.substring(j, j + i);
                }else{
                    subString = s.substring(j);
                }

                char[] chars = subString.toCharArray();
                Arrays.sort(chars);
                subString = String.valueOf(chars);
                if(hashTable.containsKey(subString)){
                    hashTable.put(subString, hashTable.get(subString) + 1);
                }else{
                    hashTable.put(subString, 1);
                }
                j++;
            }

        }

        // Step 2. Check any two substring with equal length to see if they have same characters
        Iterator<Map.Entry<String, Integer>> iterator = hashTable.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            if(next.getValue() > 1){
                answer += (next.getValue() * (next.getValue() - 1)) / 2;
            }
        }


        return answer;
    }

    public static void main(String[] args){
        sherlockAndAnagrams("abba");
    }
}
