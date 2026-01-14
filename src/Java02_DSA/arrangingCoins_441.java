package Java02_DSA;

public class arrangingCoins_441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(10));
    }
    static int arrangeCoins(int n) {

        return (int) ((Math.sqrt(8.0 * n + 1) - 1) / 2);

    }
}
