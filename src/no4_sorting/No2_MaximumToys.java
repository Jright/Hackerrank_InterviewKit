package no4_sorting;

import java.util.Arrays;

public class No2_MaximumToys {

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int toysCount = 0;
        for(int i = 0; i < prices.length; i++){
            k = k - prices[i];
            if(k > 0){
                toysCount++;
            }else{
                break;
            }
        }
        return toysCount;
//        int index = 0;
//        while(k > 0 && index < prices.length){
//            k = k - prices[index];
//            index++;
//        }
//        return index;
    }
}
