package A6투포인터;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A01TwoPointerBasic {
    public static void main(String[] args) {
////        아래 배열에서 target이 될수있는 두수의 조합을 모두 찾아내어라 (1,9), (9,1)은 같은것으로 취급
////        아래 코드의 복잡도 N^2
//        int[] arr ={7,8,9,2,4,5,1,3,6};
//        int target = 10;
//        List<int[]> myList = new ArrayList<>();
//
//        for( int i=0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i]+arr[j]==target){
//                    myList.add(new int[]{arr[i],arr[j]});
//                }
//            }
//        }
//        for(int[] a : myList){
//            System.out.println(Arrays.toString(a));
//        }

//        위 배열을 정렬 : 1,2,3,4,5,6,7,8,9
//        정렬의 복잡도 : n*log(n)
        int[] arr ={7,8,9,2,4,5,1,3,6};
        Arrays.sort(arr);
        List<int[]> myList = new ArrayList<>();
        int target =   10;
//        start, end 양쪽끝으로 설정 (s<e 조건)
//        s + e == target -> add, s++
//        s + e < target -> s++
//        s + e > target -> e--
//        투포인터의 복잡도 : n
        int start=0;
        int end= arr.length-1;
        while(start<end){
            int sum = arr[start]+arr[end];
            if(sum==target){
                myList.add(new int[]{arr[start], arr[end]});
                start++; //또는 end--;
            } else if(sum < target){
                start++;
            } else if(sum > target){
                end--;
            }
        }
        for(int[] a : myList){
            System.out.println(Arrays.toString(a));
        }
    }
}
