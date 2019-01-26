package no1_warm_up_chanllenge;

public class No2_CountingValley {


    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int result = 0;
        int upCount = 0;
        int downCount = 0;
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'U'){
                upCount++;
            }else if(s.charAt(i) == 'D'){
                if(upCount == downCount){
                    result++;
                }
                downCount++;
            }
        }
        return result;
    }


}
