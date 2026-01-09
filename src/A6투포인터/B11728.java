package A6투포인터;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arrN = new int[N];
        int[] arrM = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i =0; i<N; i++){
            arrN[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i =0; i<M; i++){
            arrM[i]=Integer.parseInt(st.nextToken());
        }

        int[] sumArr = new int[N+M];
        sumArr =




    }
}
