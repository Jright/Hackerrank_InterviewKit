package extra;

/**
 * https://www.hackerrank.com/challenges/non-divisible-subset
 * Credits to HackerRank user diego_93
 */
public class Non_Divisible_Subset {

    static int nonDivisibleSubset(int k, int[] S) {

       int[] mod = new int[k];

       for(int i = 0; i < S.length; i++){
           mod[S[i] % k]++;
       }

       int answer = 0;

       if(mod[0] > 0){
           answer++;
       }

       if(k % 2 == 0 && mod[k / 2] > 0){
           answer++;
       }

       for(int i = 1; i < k - i; i++){
           answer += Math.max(mod[i], mod[k - i]);
       }

       return answer;
    }


}
