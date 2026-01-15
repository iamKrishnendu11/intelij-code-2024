package Java02_DSA;

public class missingPositiveArray_1539 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,8,9,12,15,16};
        int k = 5;
        // missing array {3,5,10,11,13,14}
        // 5th element is 13
       // answer will be 13
        System.out.println(findKthPositive(arr,k));
    }
    static int findKthPositive(int[] arr, int k) {
        int index =0;
      for(int i =1; i<=Integer.MAX_VALUE;  i++){
          int check= binary(arr,i);
          if(check == -1){
              index ++;
          }
          if(index == k){
              return i;
          }
      }

        return index;
    }
    static int binary(int[] arr, int key){
        int start =0;
        int end= arr.length-1;
        while (start <= end){
            // find the middle element
            int mid = (start +end)/2;
            if (arr[mid]> key) end = mid - 1;
            else if (arr[mid] < key) start = mid + 1;
            else{
                // return answer
                return mid;
            }
        }
        return -1;
    }

}
