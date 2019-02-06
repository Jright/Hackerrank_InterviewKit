package no4_sorting;

public class No1_BubbleSort {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int firstElement = a[0];
        int lastElement = a[0];
        int swapCount = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > lastElement){
                lastElement = a[i];
            }else if(a[i] < firstElement){
                firstElement = a[i];
            }
            for(int j = i + 1; j < a.length; j++ ){
                if(a[i] > a[j]){
                    swapCount++;
                }
            }
        }
//        Array is sorted in 3 swaps.
//                First Element: 1
//        Last Element: 3
        System.out.printf("Array is sorted in %d swaps.\n", swapCount);
        System.out.printf("First Element: %d\n", firstElement);
        System.out.printf("Last Element: %d\n", lastElement);
    }
}
