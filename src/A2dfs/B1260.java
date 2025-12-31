package A2dfs;

import com.sun.source.tree.CompoundAssignmentTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1260 {
    static int N, M, V;
    static List<List<Integer>> adjList = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N + 1; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }
        for (List<Integer> l : adjList) {
            l.sort(Comparator.naturalOrder());
        }
        visited = new boolean[N+1];
        dfs(V);
        System.out.println();

        visited = new boolean[N+1];
        Queue<Integer> que = new LinkedList<>();
        que.add(V);
        visited[V]=true;
        while(!que.isEmpty()){
            int temp = que.poll();
            System.out.print(temp+" ");
            for(int next : adjList.get(temp)){
                if(visited[next]) continue;
                que.add(next);
                visited[next]=true;
            }
        }
    }
    static void dfs(int start) {
        System.out.print(start + " ");
        visited[start] = true;
        for (int next : adjList.get(start)) {
            if (visited[next]) continue;
            dfs(next);
        }
    }
}
