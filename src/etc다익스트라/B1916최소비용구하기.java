package etc다익스트라;

import javax.management.Query;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1916최소비용구하기 {
    static List<List<int[]>> list = new ArrayList<>();
    static int[] dist;  //노드마다 최소비용
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < N + 1; i++) {
            list.add(new ArrayList<>());
        }

        StringTokenizer st;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            list.get(s).add(new int[]{e, cost});
        }
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        dist = new int[N+1];    //노드마다 최소비용
        Arrays.fill(dist, Integer.MAX_VALUE);
        visited = new boolean[N+1];

        dijkstra(start);
        System.out.println(dist[end]);
    }

        static void dijkstra(int start) {
            Queue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[1] - o2[1];   //비용기준 오름차순 - o1:현재까지의 비용
                }
            });
            dist[start] = 0;
            pq.offer(new int[]{start, 0});

            while(!pq.isEmpty()){
                int[] cur = pq.poll();
                int now = cur[0];
                int cost = cur[1];
                if(cost>dist[now]) continue;
                for(int[] next : list.get(now)){
                    int nextNode = next[0];
                    int nextCost = cost + next[1];
                    if(nextCost<dist[nextNode]){
                        dist[nextNode] = nextCost;
                        pq.offer(new int[]{nextNode, nextCost});
                    }
                }
            }
        }
}