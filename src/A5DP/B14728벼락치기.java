package A5DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14728벼락치기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int[][] arrKS = new int[N][2];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arrKS[i][0] = a;
            arrKS[i][1] = b;
        }
        int[] dp = new int[T+1];
        for(int i=0; i<arrKS.length; i++){
            for (int j=T; j>=arrKS[i][0]; j--){
                dp[j] = Math.max(dp[j], arrKS[i][1]+dp[j-arrKS[i][0]]);
            }
        }
        System.out.println(dp[T]);





    }
}
