package Java01_DSA;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class firstandLast_34 {
    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};

        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0]= start;
        ans[1] = end;
        return ans;
    }
//
    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            // find the middle element
            int mid = (start + end) / 2;
            if (nums[mid] > target) end = mid - 1;
            else if (nums[mid] < target) start = mid + 1;
            else {
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
                // return answer
                return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
 int[] arr = {5,7,7,8,8,10};
 int target = 8;
        System.out.println(searchRange(arr, target));
    }


}
