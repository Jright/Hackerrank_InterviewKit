package no1_warm_up_chanllenge;

public class No4_RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        int unitLetterCount = 0;
        int stringLength = s.length();
        int modLetterCount = 0;
        long unitCount = n / stringLength;
        long mod = n % stringLength;
        long result;

        for(int i = 0; i < stringLength; i++){

            if(s.charAt(i) == 'a'){

                if(i < mod){
                    modLetterCount++;
                }

                unitLetterCount++;
            }
        }


        result = unitLetterCount * unitCount + modLetterCount;

        return result;

    }

}
