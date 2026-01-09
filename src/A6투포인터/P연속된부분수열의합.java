package A6투포인터;

import java.util.Arrays;

public class P연속된부분수열의합 {
    public static void main(String[] args) {
        int[] sequence = new int[]{2,2,2,2,2};
        int k = 6;
        int[] answer = new int[2];
        int start = 0;
        int sum = 0;
        int a = 0;
        int b = sequence.length-1;
        int minLen = Integer.MAX_VALUE;

        for(int end = 0; end < sequence.length; end++) {
            sum += sequence[end];

            while (sum >= k) {
                if (sum == k) {
                    int len = end - start;
                    if (minLen > len) {
                        minLen = len;
                        a = start;
                        b = end;
                    }
                }
                sum -= sequence[start];
                start++;
            }
        }
        answer = new int[]{a, b};
        System.out.println(Arrays.toString(answer));
    }
}
