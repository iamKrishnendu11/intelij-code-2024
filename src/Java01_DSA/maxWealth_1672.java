package Java01_DSA;
// https://leetcode.com/problems/richest-customer-wealth/
public class maxWealth_1672 {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int rowsum = 0;
            for (int i : account) {
                rowsum = rowsum + i;
            }
            if (rowsum > ans) {
                ans = rowsum;
            }
        }
        return ans;
    }
}
