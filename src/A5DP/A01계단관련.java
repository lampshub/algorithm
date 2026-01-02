package A5DP;

// 알고리즘 구현 문제도 풀어보기!
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class A01계단관련 {
    public static void main(String[] args) throws IOException {
////        멀리 뛰기 : 프로그래머스
//        int n = 4;
////        n번째 자리의 경우의 수는 n-1번째의 경우의수와 n-2번째 경우의수의 합
//        if(n==1) return 1;
//        int[] dp = new int[n+1];
//        dp[1]=1;
//        dp[2]=2;
//        for(int i=3; i<=dp.length; i++){
//            dp[i]=(dp[i-1]%1234567+dp[i-2]%12345967) % 1234567;
//        }


////        계단 오르기 : 백준
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        int[] scores = new int[N+1];
//        for(int i=1; i<N+1; i++){
//            scores[i]=Integer.parseInt(br.readLine());
//        }
//
//        int[] max = new int[N+1];
//        if(N>=1) max[1]=scores[1];
//        if(N>=2) max[2]=scores[1]+scores[2];
//        if(N>=3) max[3]=scores[3]+ Math.max(scores[1],scores[2]);
//        for(int i =4; i<N+1; i++){
//            max[i] = scores[i] + Math.max(max[i-2],scores[i-1]+max[i-3]);
//        }
//        System.out.println(max[N]);

////        2156 포도주시식, 9465 스티커
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        int[] wine = new int[N + 2];
//        for (int i = 1; i < N + 1; i++) {
//            wine[i] = Integer.parseInt(br.readLine());
//        }
//
//        int[] max = new int[N + 1];
//        if (N >= 1) max[1] = wine[1];
//        if (N >= 2) max[2] = wine[2] + wine[1];
//        for (int i = 3; i < N + 1; i++) {
//            max[i] = Math.max(max[i - 1], Math.max(wine[i] + max[i - 2], wine[i] + wine[i - 1] + max[i - 3]));
//        }
//    System.out.println(max[N]);
    }
}
