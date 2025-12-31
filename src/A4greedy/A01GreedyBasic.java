package A4greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//greedy(탐욕법) : 현재로서 최적의 해를 선택했을때, 전체의 최적해를 보장하는 알고리즘
public class A01GreedyBasic {
    public static void main(String[] args) {
//        1,5,10,20원짜리의 동전이 있을때, 이를 조합하여 99를 만들수있는 조합 중에 최소개수를 구하라
        int[] arr = {10,5,1,20};
        int total = 0;
        int target = 99;

        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0; i--){
            if(target/arr[i] > 0) {
                total += target/arr[i];
                target = target%arr[i];
            }
        }
        System.out.println(total);
    }
}
