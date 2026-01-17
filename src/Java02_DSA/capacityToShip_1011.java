package Java02_DSA;

public class capacityToShip_1011 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target_days = 5;
        System.out.println(shipWithinDays(arr,target_days));
    }

    static int shipWithinDays(int[] weights, int days) {
        int maxWeight = 0;
        int totalWeight = 0;

        // Step 1: Find the search range (Lower bound and Upper bound)
        for (int w : weights) {
            maxWeight = Math.max(maxWeight, w);
            totalWeight += w;
        }

        int left = maxWeight; // Smallest possible ship size
        int right = totalWeight; // Largest necessary ship size

        // Step 2: Binary Search
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canShip(weights, days, mid)) {
                // If we can ship with this capacity, try a smaller one to be optimal
                right = mid;
            } else {
                // If we can't ship, we need a bigger capacity
                left = mid + 1;
            }
        }

        return left;
    }

    // Helper function: Checks if a specific capacity works within the given days
    static boolean canShip(int[] weights, int days, int capacity) {
        int daysNeeded = 1;
        int currentLoad = 0;

        for (int weight : weights) {
            // If adding this package exceeds capacity, start a new day
            if (currentLoad + weight > capacity) {
                daysNeeded++;
                currentLoad = 0;
            }
            currentLoad += weight;
        }

        return daysNeeded <= days;
    }
}
