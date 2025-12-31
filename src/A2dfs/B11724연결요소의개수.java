package A2dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B11724연결요소의개수 {
    static List<List<Integer>> adjList = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);

        for(int i =0; i<N+1; i++){
            adjList.add(new ArrayList<>());
        }
        for(int i=0; i<M; i++){

        }
        visited = new boolean[N+1];
        int count = 0;
        for(int i=1; i<adjList.size(); i++){
            if(!visited[i]){
                dfs(i);
                count++;
            }
        }


    }

    static void dfs(int start){
        visited[start] = true;
        for(int target : adjList.get(start)){
            if(!visited[target]){
                dfs(target);
            }
        }
    }
}
