package A2dfs;

public class A02Practice {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1,1},{1,1,1,1},{1,1,2,1},{1,1,1,1}}; //4*4배열
        int[] current = {0,0};

        dfs(arr, current);

    }

    static void dfs(int[][] arr, int[] current){
        int[] dx={-1,1,0,0};
        int[] dy={0,0,1,-1};
        for(int k=0; k<4; k++){
            int nx = current[0]+dx[k];
            int ny = current[1]+dy[k];
            if(nx>=0 && nx<arr.length && ny>=0 && ny<arr[0].length){
                dfs(arr, new int[]{nx,ny});
            }
        }
    }
}
