package Java01_DSA;

import java.util.Arrays;

public class linearIn2dArray {
    public static void main(String[] args) {
        int [][] arr = {
                {1,4,9},
                {11,13,15},
                {18,118,218},
                {20,15,30},
                {40,50,60},
                {0,2,3}
        };
        int target=118;
        int[] ans= search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static  int[] search(int [][] arr, int target){
        for(int row=0; row< arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col]== target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
