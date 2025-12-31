package A2dfs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class A01DfsPractice {
    static List<List<Integer>> adjList = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) {
        int[][] nodes = {{0, 1}, {2, 0}, {1, 3}, {2, 3}, {2, 4}};
        visited = new boolean[5];
        for(int i =0; i<5; i++){
            adjList.add(new ArrayList<>());
        }
//        for(int i=0; i<nodes.length; i++){
//            adjList.get(nodes[i][0]).add(nodes[i][1]);
//            adjList.get(nodes[i][1]).add(nodes[i][0]);
//        }
        for(int[] n : nodes){
            adjList.get(n[0]).add(n[1]);
            adjList.get(n[1]).add(n[0]);
        }

        for(List<Integer> l : adjList){
            l.sort(Comparator.naturalOrder());
        }
    }

    static void dfs(int startNode){
        System.out.println(startNode);
        visited[startNode] = true;
        for(int next : adjList.get(startNode)){
            if(visited[startNode]) continue;
            dfs(next);
        }
    }
}
