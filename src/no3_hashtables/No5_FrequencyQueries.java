package no3_hashtables;

import java.util.*;

public class No5_FrequencyQueries {


    //    8
//            1 5
//            1 6
//            3 2
//            1 10
//            1 10
//            1 6
//            2 5
//            3 2
    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        ArrayList<Integer> answerList = new ArrayList<>();
        Hashtable<Integer, Integer> searchTable = new Hashtable<>();
        Hashtable<Integer, Integer> storeTable = new Hashtable<>();
        for (int i = 0; i < queries.size(); i++) {
            List<Integer> integers = queries.get(i);
            int operation = integers.get(0);
            int num = integers.get(1);

            if(operation == 1){
                if(storeTable.containsKey(num)){
                    int frequency = storeTable.get(num) + 1;
                    storeTable.put(num, frequency);

                    int frequencyValue;
                    if(searchTable.containsKey(1)){
                        frequencyValue = searchTable.get(1) + 1;
                    }else{
                        frequencyValue = 1;
                    }
                    searchTable.put(frequency, frequencyValue);
                }else{
                    storeTable.put(num, 1);

                    int frequencyValue;
                    if(searchTable.containsKey(1)){
                       frequencyValue = searchTable.get(1) + 1;
                    }else{
                        frequencyValue = 1;
                    }
                    searchTable.put(1, frequencyValue);
                }
            }else if(operation == 2){
                if(storeTable.containsKey(num)){
                    int deletedFrequency = Math.max(storeTable.get(num) - 1, 0);
                    storeTable.put(num, deletedFrequency);

                    int deletedFrequencyValue;
                    if(searchTable.containsKey(deletedFrequency)){
                        deletedFrequencyValue = searchTable.get(deletedFrequency) + 1;
                    }else{
                        deletedFrequencyValue = 1;
                    }
                    searchTable.put(deletedFrequency, deletedFrequencyValue);
                }
            }else if(operation == 3){
                if(searchTable.containsKey(num) && searchTable.get(num) == num){
                    answerList.add(1);
                }else{
                    answerList.add(0);
                }
            }

        }
        return answerList;
    }
}
