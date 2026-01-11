package Java01_DSA;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class smallestLetter_744 {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'f';
        System.out.println(nextGreatestLetter(arr, target));
    }

     static char nextGreatestLetter(char[] letters, char target) {

        int start =0;
        int end= letters.length-1;
        while (start <= end){
            // find the middle element
            int mid = (start +end)/2;
            if (letters[mid]> target) end = mid - 1;
            else{
                // return answer
                start = mid + 1;
            }
        }
        return letters[start  % letters.length];
    }

}
