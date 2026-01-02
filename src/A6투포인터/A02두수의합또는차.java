package A6투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.StringTokenizer;

//정렬이 필요한 경우
//start<end의 조건
//start가 0부터 시작. end가 length-1부터 시작
public class A02두수의합또는차 {
    public static void main(String[] args) throws IOException {
//        두수의 합 : 백준
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int x = Integer.parseInt(br.readLine());

        int count = 0;
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            int sum = arr[start] + arr[end];
            if (sum == x) {
                count++;
                start++;
            } else if (sum < x) {
                start++;
            } else if (sum > x) {
                end--;
            }
        }
        System.out.println(count);

//        두용액(2470) : 백준
//        수고르기(2230) : 백준
    }
}
