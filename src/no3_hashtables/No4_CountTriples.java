package no3_hashtables;

import java.util.*;

/**
 * Unfinished, Only passed 3/12 test cases
 */
public class No4_CountTriples {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
        long answer = 0;
        long init = arr.get(0);
        LinkedHashMap<Long, Integer> linkedHashMap = new LinkedHashMap<>();


        for(int i = 0; i < arr.size(); i++){
            long times = arr.get(i) / init;

            if(times % r == 0 || times == 1){
                if(!linkedHashMap.containsKey(times)){
                    linkedHashMap.put(times,1);
                }else{
                    linkedHashMap.put(times, linkedHashMap.get(times) + 1);
                }
            }

        }

        int[] values = new int[linkedHashMap.size()];
        int k = 0;
        Iterator<Map.Entry<Long, Integer>> iterator = linkedHashMap.entrySet().iterator();

        while(iterator.hasNext()){
            values[k] = iterator.next().getValue();
            k++;
        }

        if(values.length < 3){
            return 0;
        }
        int k0 = 0;
        while(k0 + 2 < values.length){
            int k1 = k0 + 1;
            int k2 = k0 + 2;

            answer = answer + (values[k0] * values[k1] * values[k2]);
            k0++;
        }


        return answer;
    }

    public static void main(String[] args){
        ArrayList<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(3L);
        list.add(9L);
        list.add(9L);
        list.add(27L);
        list.add(81L);
        long l = countTriplets(list, 3);
        System.out.println("Answer: " + l);
    }

}
