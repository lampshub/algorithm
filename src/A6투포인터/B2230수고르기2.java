package A6투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2230수고르기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int start = 0;
        int end = 0;
        int min = Integer.MAX_VALUE;

        while(end<arr.length){
            int diff = arr[end]-arr[start];
            if(diff>=M){
                start++;
                min = Math.min(min, diff);
                if(start>end){
                    end=start;
                }
            } else end++;
        }
        System.out.println(min);





















//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//        int[] arr = new int[N];
//        for(int i=0;i<N;i++){
//            arr[i]=Integer.parseInt(br.readLine());
//        }
//        Arrays.sort(arr);
//
//        int start = 0;
//        int end = 0;
//        int min = Integer.MAX_VALUE;
//
//        while(end<M){
//            int diff = arr[end]-arr[start];
//            if(diff<M) {
//                end++;
//            } else {
//                min = Math.min(min, diff);
//                start++;
//                if(start>end) end=start;
//            }
//        }
//        System.out.println(min);
    }
}
