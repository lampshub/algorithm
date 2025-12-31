package A5DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A02동전문제 {
    public static void main(String[] args) throws IOException {
////        1,4,5의 동전이 있을때, 조합하여 13을 만들 수 있는 최소의 개수
//        int[] arr = {1, 4, 5};
//        int target = 13;
////        n원을 만드는 최소동전수 : min(dp[n-a],dp[n-b],dp[n-c]) + 1;
//        int[] dp = new int[target + 1];
//        for (int i = 1; i <= target; i++) {
////            int min = target/arr[0];
//            int min = Integer.MAX_VALUE;
//            for (int j = 0; j < arr.length; j++) {
////                min = Math.min(dp[i-arr[j]],min);
//                if (i - arr[j] >= 0 && dp[i - arr[j]] < min) {
//                    min = dp[i - arr[j]];
//                }
//            }
//            dp[i] = min + 1;
//        }
//        System.out.println(Arrays.toString(dp));
//        System.out.println(dp[target]);

//DP 생각(idea) -> 현재 문제를 봤을때 과거의 값을 활용할수 있을지 경우를 생각해본다!
//13을 만드는건 12원+1, 9원+4, 8원+5
//12에 최소로 만드는 값이 들어있고, 그걸 활용 / 이전의 값 활용

//동전2(2294) : 백준
// -> 1이 포함되지 않을수 있고, target을 못만들수도 있는 경우의 동전문제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] coins = new int[n];
        for(int i=0; i<n; i++){
            coins[i]=Integer.parseInt(br.readLine());
        }
        int[] coinCount = new int[k+1];
        Arrays.fill(coinCount,-1);
        coinCount[0]=0;
        for(int i = 1; i<=k; i++){
            int min = Integer.MAX_VALUE;
            for(int j=0; j<n; j++){
                if(i-coins[j]>=0 && coinCount[i-coins[j]] != -1){
                    min = Math.min(min, coinCount[i-coins[j]]);
                }
            }
            if(min!=Integer.MAX_VALUE){
            coinCount[i]=min+1;}
        }
        System.out.println(coinCount[k]);
    }
}