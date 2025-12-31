package A3bfs;

import java.util.*;

public class A04그외유형 {
//    이차원배열의 최단거리 : 게임 맵 최단거리 - 프로그래머스

//    비노드형식의 거리문제 : 숨바꼭질(1697번) - 백준

    static boolean[][] visited;
    static List<List<Integer>> adjList = new ArrayList<>();
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) {
        int[][] maps = new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        Queue<int[]> queue = new LinkedList<>(); //x,y 거리
        visited = new boolean[5][5];
        visited[0][0] = true;
        int answer = -1;
        queue.add(new int[]{0, 0, 1});
        loop1 :
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + temp[0];
                int ny = dy[i] + temp[1];
                if (nx >= 0 && ny >= 0 && nx < maps.length && ny < maps[0].length) {
                    if (maps[nx][ny] == 1 && !visited[nx][ny]) {
                        queue.add(new int[]{nx, ny, temp[2]+1});
                        if(nx==maps.length-1 && ny==maps[0].length-1){
                            answer = temp[2]+1;
                            break loop1;
                        }
                    }
                }
            }
        }
        System.out.println(answer);
    }
    }
