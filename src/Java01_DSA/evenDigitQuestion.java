package Java01_DSA;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class evenDigitQuestion {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    // if digit in number is even increase the count
    static int findNumbers(int[] nums){
        int count =0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    // function to check if digit in number is even or not
    static boolean even (int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }
    // count no of digits
    static int digits(int num){
        if (num == 0){
            return 1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num=num/10;

        }
        return count;
    }
}
