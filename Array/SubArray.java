public class SubArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 9};
        int n = arr.length;

        System.out.println("All subarrays:");
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                // Print subarray from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }

        int total = n * (n + 1) / 2;
        System.out.println("Total number of subarrays: " + total);
    }
}
