package A5DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A03최대값최소값 {
    public static void main(String[] args) throws IOException {
////    RGB거리 : 백준
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        int[][] cost = new int[N][3];
//        for(int i = 0; i<N; i++){
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for(int j = 0; j<3; j++){
//                cost[i][j] = Integer.parseInt(st.nextToken());
//                }
//        }
//        System.out.println(Arrays.deepToString(cost));
//        int[][] dp = new int[N][3];
//        dp[0]=cost[0];
//        for(int i=1; i<N; i++){
//            for(int j=0; j<3; j++){
//                dp[i][j]=cost[i][j]+ Math.min(dp[i-1][(j+1)%3],dp[i-1][(j+2)%3]);
//            }
//        }
//        int minCost = Math.min(dp[N-1][0],Math.min(dp[N-1][1],dp[N-1][2]));
//        System.out.println(minCost);
//        System.out.println(Arrays.deepToString(dp));

//       정수삼각형 : 프로그래머스
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr =new int[5][];
        for(int i = 0; i<5; i++){
//        arr[i] = new int[i][i+1];
            StringTokenizer st = new StringTokenizer(br.readLine());


//       내려가기(2096) : 백준
    }
}
