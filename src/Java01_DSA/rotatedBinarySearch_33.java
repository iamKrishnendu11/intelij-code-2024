package Java01_DSA;
// not work for duplicate value
public class rotatedBinarySearch_33 {
    public static void main(String[] args) {
        int[] arr ={4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
        int target =3;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        // if no pivot means array not rotated
        // do normal binary search
        if(pivot == -1){
            return binary(arr,target,0,arr.length-1);
        }
        // if pivot found there will be two acending array
        if(arr[pivot] == target){
            return  pivot;
        }
        if(target >= arr[0]){
            return binary(arr,target, 0,pivot-1);
        }

            return binary(arr, target,pivot+1,arr.length-1);

    }
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
