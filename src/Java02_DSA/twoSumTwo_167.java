package Java02_DSA;

import java.util.Arrays;

public class twoSumTwo_167 {
    public static void main(String[] args) {
        int[] numbers = {1,2,4,8,9,11,13,21,25,28,29,40};
        int target = 21;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
    static int[] twoSum(int[] arr, int target){
        // two pointer technique

        int start =0;
        int end = arr.length-1;
        while(start <= end){
            if(arr[start] + arr[end] == target){
                return new int[] {start+1, end+1};
            } else if(arr[start] +arr[end] > target) {
                end = end -1;
            }
            else{
               start = start +1;
            }
        }
        return new int[] {-1, -1};
    }

}
