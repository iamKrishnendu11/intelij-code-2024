package Java01_DSA;

public class linearInRange {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 0, -7, 112, 56};
        int key = 112;
        int ans = linear(nums, key,1,8);
        System.out.println(ans);
    }
    static int linear(int[] arr, int key, int start, int end ) {
        if (arr.length == 0) {
            return -1;
        }
        // run  the loop
        for(int i=start; i<end; i++){
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
