package no3_hashtables;

import java.util.Hashtable;

public class No1_RansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        Hashtable<String, Integer> resources = new Hashtable<>();

        for(String word:magazine){
            if(resources.containsKey(word)){
                resources.put(word, resources.get(word) + 1);
            }else{
                resources.put(word, 1);
            }
        }

        for(String useWord: note){
            if(resources.containsKey(useWord) && resources.get(useWord) > 0){
                resources.put(useWord, resources.get(useWord) - 1);
            }else{
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");

    }
}
