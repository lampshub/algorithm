package A1sort;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class A02힙정렬문제풀이 {
    public static void main(String[] args) {
//    프로그래머스 : 명예의 전당
//        int k = 4;
//        int score[] = new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
////        size_t score_len
//        Queue<Integer> pq = new PriorityQueue<>();
//        for(int i=0; i<score.length; i++){
//            if(pq.size()<k){
//                pq.add(score[i]);
//            }
//            else {
//                pq.add(score[i]);
//                pq.poll();
//            }
//            System.out.print(pq.peek()+" ");

//    프로그래머스 : 야근지수
        int n=1;
        int[] works = new int[]{2,1,2};

        Queue<Integer> afterWorks = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : works){
            afterWorks.add(i);
        }

        for(int i=0; i<n; i++){
            int afterHour = afterWorks.poll()-1;
            if(afterWorks.peek()==0) afterWorks.poll();
            if(afterWorks.isEmpty()) {
                break;
            };
            afterWorks.add(afterHour);
        }
        int result = 0;
        for(int i=0; i<works.length; i++){
            result += Math.pow(afterWorks.poll(),2);
        }
        System.out.println(result);

        }
    }

