package A2dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B11725트리의부모찾기 {
    static List<List<Integer>> adjList = new ArrayList<>();
    static boolean[] visited;
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        visited = new boolean[N + 1];
        parent = new int[N+1];

        for (int i = 0; i < N + 1; i++) {
            adjList.add(new ArrayList<>());
        }


        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }

        dfs(1);

        StringBuilder sb = new StringBuilder();
        for(int i=2; i<=N; i++){
            sb.append(parent[i]).append("\n");
        }
        System.out.println(sb);
    }

    static void dfs(int cur) {
        visited[cur] = true;
        for (int next : adjList.get(cur)) {
            if (visited[next]) continue;
            parent[next] = cur;
            dfs(next);
        }
    }
}
