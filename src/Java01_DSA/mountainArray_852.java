package Java01_DSA;

public class mountainArray_852 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
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
}
