package A2dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B11725Practice {
    static List<List<Integer>> adjList = new ArrayList<>();
    static boolean[] visited ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N+1; i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=0; i<N-1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }
        visited = new boolean[N+1];




    }
//    static void dfs(int start){
//        for(int i=0; )
//        if(visited[start]) continue;
//
//    }

}