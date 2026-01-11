package Java01_DSA;
// https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/
public class infiniteArray {
    public static void main(String[] args) {
        int [] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(findRange(arr, target));
    }

    static int binary(int[] arr, int key, int start, int end){

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
    static int findRange(int[]arr, int target){
        // start with size of box 2
        int start =0;
        int end = 1;
        // condition for target lie in the range is
        while(target > arr[end]){
            int newStart = end +1;
           // double the box size
            // end = previous end + size of box *2
            end = end + (end-start +1) * 2;
            start = newStart;
        }
        return binary(arr, target,start,end);
    }
}
