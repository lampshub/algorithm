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

////       정수삼각형 : 프로그래머스
////        정수삼각형 : 백준
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][];
        for(int i = 0; i<N; i++) {
            arr[i] = new int[i + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < i+1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(Arrays.deepToString(arr));

        int[][] dp = new int[N][];
        dp[0]=arr[0];
        for(int i = 1; i<N; i++) {
            dp[i] = new int[i + 1];
            for (int j = 0; j < dp[i].length; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + arr[i][j];
                } else if(i == j){
                    dp[i][j] = dp[i - 1][j-1] + arr[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + arr[i][j];
                }
            }
        }
        int max = 0;
        for(int i=0; i<dp[N-1].length; i++){
                max = Math.max(dp[N-1][i],max);
        }
        System.out.println(max);

////       내려가기(2096) : 백준
////        1) 이전줄만 기억하는 1차원 배열 사용 -> O(1)
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        int[] prevMax = new int[3];
//        int[] prevMin = new int[3];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for(int i = 0; i<3; i++){
//            int v = Integer.parseInt(st.nextToken());
//            prevMax[i]=v;
//            prevMin[i]=v;
//        }
//
//        for(int i=1; i<N; i++){
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            int c = Integer.parseInt(st.nextToken());
//            int[] curMax = new int[3];
//            int[] curMin = new int[3];
//
//            curMax[0]= Math.max(prevMax[0],prevMax[1])+ a;
//            curMin[0]= Math.min(prevMin[0],prevMin[1])+ a;
//            curMax[1]= Math.max(prevMax[0],Math.max(prevMax[1],prevMax[2]))+ b;
//            curMin[1]= Math.min(prevMin[0],Math.min(prevMin[1],prevMin[2]))+ b;
//            curMax[2]= Math.max(prevMax[1],prevMax[2])+ c;
//            curMin[2]= Math.min(prevMin[1],prevMin[2])+ c;
//            prevMax = curMax;
//            prevMin = curMin;
//        }
//        int max = Math.max(Math.max(prevMax[0],prevMax[1]),prevMax[2]);
//        int min = Math.min(Math.min(prevMin[0],prevMin[1]),prevMin[2]);
//        System.out.println(max +" "+ min);


//        2) 메모리초과 가능성 있음 -> O(N)
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        int[][] arr = new int[N][3];
//        for(int i=0; i<N; i++){
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for (int j=0; j<3; j++){
//                arr[i][j]= Integer.parseInt(st.nextToken());
//            }
//        }
//        int[][] dpMax = new int[N][3];
//        int[][] dpMin = new int[N][3];
//        dpMax[0]=arr[0];
//        dpMin[0]=arr[0];
//        for(int i=1; i<N; i++){
//            for (int j=0; j<3; j++){
//                if(j==0){
//                    dpMax[i][j] = Math.max(dpMax[i-1][j],dpMax[i-1][j+1]) + arr[i][j];
//                    dpMin[i][j] = Math.min(dpMin[i-1][j],dpMin[i-1][j+1]) + arr[i][j];
//                } else if(j==1){
//                    dpMax[i][j] = Math.max(dpMax[i-1][0],Math.max(dpMax[i-1][1],dpMax[i-1][2])) + arr[i][j];
//                    dpMin[i][j] = Math.min(dpMin[i-1][0],Math.min(dpMin[i-1][1],dpMin[i-1][2])) + arr[i][j];
//                } else if(j==2){
//                    dpMax[i][j] = Math.max(dpMax[i-1][j-1],dpMax[i-1][j]) + arr[i][j];
//                    dpMin[i][j] = Math.min(dpMin[i-1][j-1],dpMin[i-1][j]) + arr[i][j];
//                }
//            }
//        }
//        int max = -1;
//        int min = 10;
//        for(int i=0; i<3; i++){
//            if(max<dpMax[N-1][i]){
//                max = dpMax[N-1][i];
//            }
//            if(min>dpMin[N-1][i]){
//                min = dpMin[N-1][i];
//            }
//        }
//        System.out.println(max + " " + min);


// 스티커(9465), 포도주(2156), LIS(11053), 정수삼각형(1932)


    }
}
