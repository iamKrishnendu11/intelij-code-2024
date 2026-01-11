package Java01_DSA;

public class SearchInMountain_1095 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        System.out.println(search(arr, target));
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length - 1;

        while (start < end ){
            int mid = (start + end) / 2;
            if (arr [mid] > arr[mid + 1]){
                // you are in decreasing part of array
                // this may be the answer but look at the left
                end = mid;
            } else {
                // you are in ascending part of array
                start = mid + 1;

            }
        }
        // int the end start = end = pointing to the largest number
        return start;  // or return end
    }
   static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = binary2(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        } else {
            // try to search in descending array
            return binary2(arr, target, peak+1, arr.length-1);
        }
    }

    static int binary2(int[] arr, int key, int start, int end){

        while (start <= end){
            // find the middle element
            int mid = (start +end)/2;
            if (arr[mid]< key) end = mid - 1;
            else if (arr[mid] > key) start = mid + 1;
            else{
                // return answer
                return mid;
            }
        }
        return -1;
    }
}
