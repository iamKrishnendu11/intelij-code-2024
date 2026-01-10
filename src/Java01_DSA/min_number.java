package Java01_DSA;

public class min_number {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 0, -7, 112, 56};
        System.out.println(min(nums));
    }


    static int min(int[] arr){
        // assume array.length !=0
        int ans = arr[0];
        for (int i=1; i<arr.length;i++){
            if(arr[i] < ans ){
                ans = arr[i];

            }
        }
        return ans;
    }
}
