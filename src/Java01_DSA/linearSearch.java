package Java01_DSA;

public class linearSearch {
    public static void main(String[] args) {
     int[] nums = {23, 45, 1, 2, 8, 0, -7, 112, 56};
     int key = 112;
     int ans = linear(nums, key);
     System.out.println(ans);
    }

    // search in the array: return the index if item is found
    // otherwise return -1
    static int linear(int[] arr, int key ) {
        if (arr.length == 0) {
            return -1;
        }
        // run  the loop
        for(int i=0; i<arr.length; i++){
            // check for every element if it is the key or not
            int element = arr[i];
            if (element== key){
                return i;
            }
        }
        // if none of the element is equal to key return -1
        return -1;
    }
}
