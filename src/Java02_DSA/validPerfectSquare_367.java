package Java02_DSA;

public class validPerfectSquare_367 {
    public static void main(String[] args) {
        int target = 16;
        System.out.println(isPerfectSquare(target));
    }
    static boolean isPerfectSquare(int x) {
        if (x < 2) return true;

        int start = 1, end = x;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Use long to prevent overflow
            long square = (long) mid * mid;

            if (square == x) {
                return true;
            } else if (square < x) {

                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
