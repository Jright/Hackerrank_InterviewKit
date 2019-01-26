package no2_arrays;

public class No3_New_Year_Chaos {


    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {

        int steps = 0;
        for(int i = 0 ; i < q.length; i++){

            if(q[i] - (i + 1) > 2){
                steps = -1;
                break;
            }

            for(int j = Math.max(0, q[i] - 2); j < i; j ++){
                if(q[i] < q[j]){
                    steps++;
                }
            }

        }

        if(steps != -1){
            System.out.println(String.valueOf(steps));
        }else{
            System.out.println("Too chaotic");
        }
    }

}
