package A6투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A03Practice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        int start=0;
        int end = 0;
        int count=0;
        int sum = arr[end];

        while(end<arr.length){
            if(sum==M){
                count++;
                sum -= arr[start];
                start++;
                end++;
                if(end==arr.length) break;
                sum += arr[end];
            } else if (sum < M) {
                end++;
                if(end==arr.length) break;
                sum += arr[end];
            } else if (sum > M) {
                if(start<end){
                    sum -= arr[start];
                    start++;
                } else {
                    sum -= arr[start];
                    start++;
                    end++;
                    if(end==arr.length) break;
                    sum += arr[end];
                }
            }
        }
        System.out.println(count);
    }
}
