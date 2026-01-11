package Java01_DSA;

public class cellingAndFloor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println(cellingSearch(arr, target));
        System.out.println(floorSearch(arr, target));
    }

    static int cellingSearch(int[] arr, int key){
        int start =0;
        int end= arr.length-1;
        while (start <= end){
            // find the middle element
            int mid = (start +end)/2;
            if (arr[mid]> key) end = mid - 1;
            else if (arr[mid] < key) start = mid + 1;
            else{
                // return answer
                return arr[mid];
            }
        }
        return arr[start];
    }
    static int floorSearch(int[] arr, int key){
        int start =0;
        int end= arr.length-1;
        while (start <= end){
            // find the middle element
            int mid = (start +end)/2;
            if (arr[mid]> key) end = mid - 1;
            else if (arr[mid] < key) start = mid + 1;
            else{
                // return answer
                return arr[mid];
            }
        }
        return arr[end];
    }
}
