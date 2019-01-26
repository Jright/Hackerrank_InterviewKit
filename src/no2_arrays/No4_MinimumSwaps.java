package no2_arrays;



public class No4_MinimumSwaps {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int answer = 0;
        boolean[] visited = new boolean[arr.length];

        for(int i = 0; i < arr.length; i++){
            if(visited[i] || i == (arr[i] - 1)){
                continue;
            }

            int j = i;
            int cycle = 0;
            while(!visited[j]){
                visited[j] = true;
                j = (arr[j] - 1);
                cycle++;
            }
            answer = answer + cycle - 1;
        }

        return answer;

    }

}


//    static int minimumSwaps(int[] arr) {
//        int n = arr.Length;
//
//        int ans = 0;
//        var p = new Dictionary<int, int>();
//
//        for(int i = 0; i < n; i++) {
//            p[arr[i]] = i;
//        }
//
//        var list = p.Keys.ToList();
//        list.Sort();
//
//        var visited = new bool[n];
//
//        for(int i = 0; i < n; i++) {
//            if(visited[i] || p[list[i]] == i) {
//                continue;
//            }
//
//            int cycle = 0;
//            int j = i;
//
//            while(!visited[j]) {
//                visited[j] = true;
//                j = p[list[j]];
//                cycle++;
//            }
//
//            ans += (cycle - 1);
//        }
//
//        return ans;
//    }
