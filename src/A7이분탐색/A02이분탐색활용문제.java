package A7이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

//이분탐색문제는 이분탐색의 대상을 어떤것으로 설정할지가 핵심
public class A02이분탐색활용문제 {
    public static void main(String[] args) throws IOException {
//        예산 : 백준 => 상한액을 이분탐색 대상으로 선정. 계산한값이 총예산보다 작거나같으면 answer세팅.
//        1. 이분탐색의 대상 : 상한액 1원~150원
//        2. 상한액 * 모든요청 == 예산금액 일경우만 answer를 구하면 안됨
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr= new int[N];
        for(int i=0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.toString(arr);   // 110 120 140 150
        int M = Integer.parseInt(br.readLine());
        int start =1;
        int end = Arrays.stream(arr).max().getAsInt();  //arr정렬안하고 max값 구함
//                arr[arr.length-1];  //예산중에 제일 큰 값
        int answer = -1;

        while(start<=end){
            int mid = (start+end)/2;
//                총액구하기
            int total = 0;
            for(int i=0; i<arr.length; i++){
                total += (arr[i] > mid ? mid : arr[i]);
            }
            if(total==M){
                answer = mid;
                start = mid+1;
            } else if (total < M) {
                end = mid-1;
            } else if (total > M) {
                answer = mid;
                start = mid+1;
            }
        }
        System.out.println(answer);

//        과자나눠주기 : 백준 => 과자길이를 이분탐색의 대상으로 선정. 계산한값이 조카사람수보다 크거나같은면 answer세팅
//        입국심사 : 백준 (어려움)

    }
}
