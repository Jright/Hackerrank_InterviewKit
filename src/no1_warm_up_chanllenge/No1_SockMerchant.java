package no1_warm_up_chanllenge;

import java.io.IOException;
import java.util.*;

public class No1_SockMerchant {


    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (countMap.containsKey(ar[i])){
                countMap.put(ar[i], countMap.get(ar[i]) + 1);
            }else{
                countMap.put(ar[i], 1);
            }
        }

        int pairCount = 0;
        Iterator<Map.Entry<Integer, Integer>> iterator = countMap.entrySet().iterator();
        while(iterator.hasNext()){

            Map.Entry<Integer, Integer> next = iterator.next();
            System.out.println("Key: " + next.getKey() + ", Value: " + next.getValue());
            pairCount += next.getValue() / 2;
        }
        return pairCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = 9;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        int result = sockMerchant(n, ar);
        System.out.println("Socks pair is: " + result);

    }

}
