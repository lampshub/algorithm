package A3bfs;

import java.awt.*;
import java.util.*;
import java.util.List;

public class A02Practice {
    static List<List<Integer>> adjList = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) {
        int[][] nodes = {{0,1},{2,0},{1,3},{2,3},{2,4}};
        visited = new boolean[5];

        for(int i = 0; i<5; i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] n : nodes){
            adjList.get(n[0]).add(n[1]);
            adjList.get(n[1]).add(n[0]);
        }
        for(List<Integer> l : adjList){
            l.sort(Comparator.naturalOrder());
        }

//        0부터 target까지 가는 최단거리
        int target = 4;
        int answer = -1;

        Queue<int[]> que = new LinkedList<>(); //int배열안에는 {노드번호,거리}
        que.add(new int[]{0,0});
        visited[0] = true;
        loop1 :
        while(!que.isEmpty()){
            int[] temp = que.poll();
            for(int a : adjList.get(temp[0])){
                if(visited[a]) continue;
                que.add(new int[]{a,temp[1]+1});
                visited[a]=true;
                if(a==target){
                    answer=temp[1]+1;
                    break loop1;
                }
            }
        }
        System.out.println(answer);

    }
}
