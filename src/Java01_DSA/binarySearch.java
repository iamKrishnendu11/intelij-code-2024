package Java01_DSA;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr= {2,3,4,5,6,7,8,9,10,11,12,13,14} ;
        int target = 10;
        System.out.println(binary(arr,target));
    }
    // return the index
    // return -1 if key doesn't exist
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
