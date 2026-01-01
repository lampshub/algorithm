package A5DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11055가장큰증가하는부분수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] sumArr = new int[N];
        for(int i=0; i<N; i++){
            sumArr[i]=arr[i];       //초기값 arr그대로 세팅**
        }
        for(int i =1; i<N; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    sumArr[i] = Math.max(sumArr[j] + arr[i], sumArr[i]);
                }
            }
        }
        int max = 1;
        for(int i=0; i<N; i++){
            if(sumArr[i]>max){
                max = sumArr[i];
            }
        }
        System.out.println(max);
    }
}
