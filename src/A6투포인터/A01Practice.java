package A6투포인터;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A01Practice {
    public static void main(String[] args) {
////        아래 배열에서 target이 될수있는 두수의 조합을 모두 찾아내어라 (1,9), (9,1)은 같은것으로 취급
////          복잡도 N^2
        int[] arr ={7,8,9,2,4,5,1,3,6};
        int target = 10;
//        List<int[]> list = new ArrayList<>();
//
//        for(int i=0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i]+arr[j] == target){
//                    list.add(new int[]{arr[i],arr[j]});
//                }
//            }
//        }
//        for(int[] a : list){
//            System.out.println(Arrays.toString(a));
//        }

//        배열을 정렬 -> 복잡도 nlog(n)
//        투포인터 복잡도 : n
        Arrays.sort(arr);
        List<int[]> list = new ArrayList<>();
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int sum=arr[start] + arr[end];
            if(sum==target){
                list.add(new int[]{arr[start],arr[end]});
                start++;
            } else if(sum>target){
                end--;
            } else if (sum<target){
                start++;
            }
        }
        for(int[] a : list){
            System.out.println(Arrays.toString(a));
        }

    }
}
