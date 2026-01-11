package Java01_DSA;
// https://www.geeksforgeeks.org/dsa/find-rotation-count-rotated-sorted-array/
// rotation count = index of pivot + 1;
public class rotationCount {
    public static void main(String[] args) {
        int[] arr ={4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
    }

    private static int countRotations(int[] arr) {
        return findPivot(arr) + 1;
    }
    // use this for non-duplicate array
    static int findPivot(int[] arr){
        int start =0;
        int end = arr.length -1;
        while(start <= end){
            int mid = (start + end ) / 2;
            // case 1
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            // case 2
            if (arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            // case 3
            if(arr[mid] <= arr[start]){
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    // use this for duplicate array
    static int findPivotDuplicate(int[] arr){
        int start =0;
        int end = arr.length -1;
        while(start <= end){
            int mid = (start + end ) / 2;
            // case 1
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            // case 2
            if (arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            // case 3
            // if element in start,end ,middle is equal.
            // just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid]== arr[end]){
                // what if start and end is pivot
                // check start
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                // check end
                if(arr[end] < arr[end-1]){
                    return end - 1;
                }
                end--;
            }
            // left side is sorted so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid]> arr[end])) {
                start = mid+1;
            } else {
                end = mid -1;
            }

        }
        return -1;
    }
}
