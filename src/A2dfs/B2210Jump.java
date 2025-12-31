package A2dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

//25/12/30 오전수업 1:26
public class B2210Jump {
    static int[][] arr = new int[5][5];
    static Set<String> set = new HashSet<>();
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int[] current = {i, j};
                dfs(i, j,"");
            }
        }
        System.out.println(set.size());
    }

        static void dfs(int x, int y, String temp){
            if(temp.length()==6) {
                set.add(temp);
                return;
            }
            for(int i=0; i<4; i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx>=0 && ny>=0 && nx<5 && ny<5) {
                dfs(nx, ny, temp+arr[nx][ny]);
            }
        }
    }

}
