package A6투포인터;

//26/1/2 수업
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//정렬을 하면 안되는 경우
//start<=end의 조건
//start와 end가 같이 출발
public class A03수열의범위 {
    public static void main(String[] args) throws IOException {
////        수들의 합2(2003) : 백준
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//        int[] arr = new int[N];
//        st = new StringTokenizer(br.readLine());
//        for(int i=0; i<N; i++){
//            arr[i]=Integer.parseInt(st.nextToken());
//        }
//        int count = 0;
//        int start = 0;
//        int end = 0;
//        int sum = 0;
//        while(end<arr.length){
//            if(sum==M){
//                count++;
//                start++;
//                sum -= arr[start];
//                if(start>end){
//                    end++;
//                    if(end>arr.length)break;
//                }
//            } else if (sum < M) {
//                end++;
//                if(end>arr.length)break;
//                sum += arr[end];
//            }else if (sum > M){
//                start++;
//                sum -= arr[start];
//
//            }
//        }
//        System.out.println(count);




////         강사님코드
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        String[] stArr = br.readLine().split(" ");
        int[] arr = new int[N];
        for (int i=0; i< stArr.length; i++){
            arr[i] = Integer.parseInt(stArr[i]);
        }
        int start = 0;
        int end = 0;
        int count = 0;
        int sum = arr[start];
        while (start<=end && end<arr.length){
            if(sum==M){
                count++;
                end++;
                if(arr.length==end)break;
                sum += arr[end];
            }else if(sum<M){
                end++;
                if(arr.length==end)break;
                sum += arr[end];
            }else if(sum>M){
                sum -= arr[start];
                start++;
                if(start > end){
                    end++;
                    if(arr.length==end)break;
                    sum += arr[end];
                }
            }

        }
        System.out.println(count);
    }
}

//        오전수업12시~, 오후수업시작~10분
//        연속된부분수열의합 : 프로그래머스

//        숫자의 표현 : 프로그래머스
