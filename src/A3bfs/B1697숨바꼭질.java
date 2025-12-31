package A3bfs;

import java.util.*;

public class B1697숨바꼭질 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int K = Integer.parseInt(sc.nextLine());
        boolean[] visited = new boolean[100001];

        int count = 0;
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{N, 0});   //현재위치, 이동횟수 (시작점)
        visited[N] = true;
        while (!que.isEmpty()) {
            int[] temp = que.poll();
            int pos = temp[0];
            int time = temp[1];
            if (pos == K) {     //처음 k에 도착한 순간 = 최단시간 -> 종료
                System.out.println(time);
                break;
            }

            int[] nextPos = {pos - 1, pos + 1, pos * 2};
            for (int next : nextPos) {
                if (next >= 0 && next <= visited.length && !visited[next]) {
                    visited[next] = true;
                    que.add(new int[]{next, time + 1});
                }
            }
        }
    }
}


