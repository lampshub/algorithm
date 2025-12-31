package A4greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class A02그리디활용문제 {
    public static void main(String[] args) throws IOException {
////        체육복 : 프로그래머스 => 왼쪽에 있는 친구부터 주는 당장의 선택은 최적의 결과 보장
//        int n=5;
//        int[] lost = new int[]{2,4};
//        int[] reserve = new int[]{1,3,5};
//        int[] students= new int[n+1];       //0 : 정상, -1 : 없는 학생, 1 : 여유있는 학생
//
//             for(int i : lost){
//                 students[i] = -1;
//             }
//             for(int i : reserve){
//                 if(students[i] == -1) students[i] = 0;
//                 else students[i] = 1;
//             }
//             for(int i=1; i<n+1; i++){
//                if(students[i]==1){
//                    if(i-1>0 && students[i-1]==-1){
//                        students[i]=0;
//                        students[i-1]=0;
//                    }else if (i+1<=n && students[i+1]==-1){
//                        students[i]=0;
//                        students[i+1]=0;
//                    }
//                }
//             }
//             int count=0;
//             for(int i=1; i<n+1; i++){
//                 if(students[i]>=0)
//                     count++;
//             }
//        System.out.println(count);



////        수리공 항승 : 백준 => 가장 왼쪽부터 붙여나가는 선택은 손해가 없는 최적의 선택 보장
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int N = Integer.parseInt(st.nextToken() );
//        int L = Integer.parseInt(st.nextToken() );
//        int[] arr = new int[N];
//
//        st = new StringTokenizer(br.readLine());
//        for(int i=0; i<N; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(arr);
//
//        int end = arr[0]+L;
//        int Lcount = 1;
//        for(int i=1; i<N; i++){
//            if(end>arr[i]) continue;
//            else {
//                end = arr[i]+L;
//                Lcount++;
//            }
//        }
//        System.out.println(Lcount);

////        그리디 알고리즘 문제 풀어보기
    }
}
