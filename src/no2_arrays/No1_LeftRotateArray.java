package no2_arrays;

public class No1_LeftRotateArray {

    static int[] rotLeft(int[] a, int d) {
        int[] b = new int[a.length];
        int distance = d % a.length;
        for(int i = 0; i < a.length; i++){
            if(i + distance < a.length){
                b[i] = a[i + distance];
            }else{
                b[i] = a[i + distance - a.length];
            }
        }
        return b;
    }

}
