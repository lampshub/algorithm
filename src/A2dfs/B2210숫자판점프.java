package A2dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class B2210숫자판점프 {
    static int[][] arr = new int[5][5];
    static Set<String> mySet = new HashSet();
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i<5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i<5; i++){
            for(int j=0; j<5; j++){
                dfs(i,j,1,String.valueOf(arr[i][j]));
            }
        }
        System.out.println(mySet.size());

    }
    static void dfs(int x, int y, int depth, String num){
        if(depth==6){
            mySet.add(num);
            return;
            }
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && ny>=0 && nx<5 && ny<5){
                dfs(nx, ny, depth+1, num+arr[nx][ny]);
            }
        }
    }
}
