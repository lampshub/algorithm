package A5DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

//25/12/25 오후수업 1:06:00
// 배낭문제 : 여러개의 선택대상이 있고, 전체자원한도내에서 선택조합을 구성하여 최대값/최소값을 구하는 문제
public class A05배낭문제 {
    public static void main(String[] args) throws IOException {
//  평범한 배낭 - 백준
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][2];
        for(int i =0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            arr[i][0]=a;
            arr[i][1]=b;
        }
        int[] dp= new int[K+1];
        Arrays.fill(dp,0);
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<arr.length; j++) {
                if (i - arr[j][0] > 0) {
                    dp[i] = Math.max(dp[i], arr[j][1] + dp[i - j]);
                }
            }
        }
        System.out.println(Arrays.toString(dp));




//        List<List<Integer>> combiCase = new ArrayList<>();
//        for(int i=0; i<N; i++){
//            for(int j=i+1; j<N; j++){
//                List<Integer> temp = new ArrayList<>();
//            } -> dfs로 하면 안됨. 2의 n제곱
//        int[] dp = new int[K+1];
//        for (int i=0; i<bagWV.length; i++){
//            for(int j=K; j>=bagWV[i][0]; j--){   //물건의 무게가 있는 index
//                dp[j]= Math.max(dp[j],dp[j-bagWV[i][0]]+bagWV[i][1]);
//            }
//            System.out.println();
//        }

//        평범한 벼락치기(14728) - 백준
//        -> 주어진 데이터를 1번만 사용가능
//        호텔  - 백준
//        -> 주어진 데이터를 여러번 사용가능
    }
}
