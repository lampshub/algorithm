package A5DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//문제풀이 25/12/31 오후
public class A04문자열수열 {
    public static void main(String[] args) throws IOException {
//    가장 긴 증가하는 부분 수열(11053) : 백준  (dfs로 생각하면 2의n제곱, dp구현하면 n제곱)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[N];
        Arrays.fill(dp,1);
//        dp식 :   max(dp[n-1], dp[n-2] ...) 중에서 arr[n]보다 작은 dp값 +1

        for(int i=0;i<N;i++){
            for(int j=0; j<i; j++){
                if(arr[i]>arr[j])
                dp[i]=Math.max(dp[j]+1, dp[i]);
            }
        }
        int max = 1;
        for(int i=0; i<dp.length; i++){
            if(max<dp[i]){
                max = dp[i];
            }
        }
        System.out.println(max);



//        for(int i=0; i<N; i++) {
//            for (int j = 0; j<i; j++) {
//                    if(arr[j]<=arr[i] && j>0){
//                    dp[i] = Math.max(dp[j], dp[j - 1]) + 1;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(dp));
//        int max = 1;
//        for(int i = 0; i<dp.length; i++ ){
//            if(dp[i]>max) {
//                max = dp[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(Arrays.stream(dp).max().getAsInt());

//        가장 긴 증가하는 부분 수열4 : 백준 (DP+역추적)
//        => 별도의 배열을 하나 더 만들어서, 직전의 값(index)을 기록
    }
}