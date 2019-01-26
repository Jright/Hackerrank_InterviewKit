package no1_warm_up_chanllenge;

public class No3_JumpingCloud {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int i = c.length - 1;
        int result = 0;
        while (i >= 2) {
            if (c[i - 2] == 0) {
                i = i - 2;
                result++;
            } else if (c[i - 1] == 0) {
                i = i - 1;
                result++;
            }
        }

        if(i == 1){
            result++;
        }

        return result;
    }
}
