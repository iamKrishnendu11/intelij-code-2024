package Java02_DSA;

public class searchInsertPosition_35 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 4;
        System.out.println(binary(arr, target));
    }
    static int binary(int[] arr, int key){
        int start =0;
        int end= arr.length-1;

        while (start <= end){
            // find the middle element
             int mid = (start +end)/2;
            if (arr[mid]> key){ end = mid - 1;}
            else if (arr[mid] < key) start = mid + 1;
            else{
                // return answer
                return mid;
            }
        }
        return end+1;
    }
}
