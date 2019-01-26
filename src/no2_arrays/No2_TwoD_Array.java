package no2_arrays;

import java.util.TreeSet;

public class No2_TwoD_Array {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        TreeSet<Integer> resultSet = new TreeSet<>();
        for(int i = 0; i < arr.length - 2; i++){
            for(int j = 0; j < arr[i].length - 2; j++){
                int result = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
                        arr[i + 1][j + 1] +
                arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                resultSet.add(result);
                System.out.println("Add result: " + result);
                System.out.println("Elements: i,j = " + arr[i][j] + "Elements: i + 1,j = " + arr[i + 1][j] + "Elements: i + 2,j = " + arr[i + 2][j]);
            }
        }
        return resultSet.last();
    }
}
