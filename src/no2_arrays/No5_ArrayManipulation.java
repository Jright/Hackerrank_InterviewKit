package no2_arrays;

import java.util.Arrays;

public class No5_ArrayManipulation {


    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long[] array = new long[n + 1];
        Arrays.fill(array,0);
        for(int i = 0; i < queries.length; i++){
            int startAdd = queries[i][0] - 1;
            int endAdd = queries[i][1];
            int valueAdd = queries[i][2];

            array[startAdd] += valueAdd;
            array[endAdd] -= valueAdd;
        }

        long count = 0;
        long max = 0;
        for(int j = 0; j < n; j++){
            count += array[j];
            max = Math.max(count, max);
        }

        return max;
    }


}
