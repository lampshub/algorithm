package etc다익스트라;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1238파티 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        List<List<int[]>> list = new ArrayList<>();
        List<List<int[]>> reverse = new ArrayList<>();
        for(int i=0; i<N+1; i++){
            list.add(new ArrayList<>());
            reverse.add(new ArrayList<>());
        }
//        i->T최단거리 => 간선방향을 뒤집에서 T->i문제로 사용
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            list.get(a).add(new int[]{b,c});
            list.get(b).add(new int[]{a,c});
        }
//        1->2->3->T 일때 1->T, 2->T, 3->T => 간선방향 뒤집은 T->3->2->1활용 T->3, T->2, T->1
        int[] go = dijkstra(list, T, N);
        int[] back = dijkstra(reverse, T, N);

        int max = 0;
        for(int i=1; i<=N; i++){
            max = Math.max(max, go[i]+back[i]);
        }

        System.out.println(max);
    }

    static int[] dijkstra(List<List<int[]>> list, int start, int N){
        int[] dist = new int[N+1];      //각 정점까지 최단거리 저장용
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
//        int[]{정점거리, 현재까지의거리}, 최단거리로 알아야하니 [1]이 작은것부터.
        Queue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{start,0});

        while(!pq.isEmpty()){
            int[] cur = pq.poll();  // 리스트1일때 => {3,2}
            int now = cur[0];       //3
            int cost = cur[1];      //2
            if(cost>dist[now]) continue;        //dist[3] => MAX값
            for(int[] next : list.get(now)){    //list.get(3) = <[1,2],[4,4]>
                int nNode = next[0];            //3->1 / 3->4
                int nCost = cost + next[1];     //2+2 / 2+4
                if(dist[nNode]>nCost){          //dist[1] => MAX값 > 4   /dist[4] => !4>6
                    dist[nNode] = nCost;        //dist[1] = 4
                    pq.offer(new int[]{nNode, nCost});  //{1,4}
                }
            }
            return dist;    //최단거리
        }
    }
}
