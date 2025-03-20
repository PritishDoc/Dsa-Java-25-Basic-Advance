public class LeaderinanArray {
    static int Leader(int arr[]) {
        // Find the first leader from the left
        for (int i = 0; i < arr.length; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) { // If any right element is greater, it's not a leader
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                return arr[i]; // Return the first leader found
            }
        }
        return -1; // No leader found
    }

    public static void main(String[] args) {
        int arr[] = {20, 30, 30, 89, 76, 91};
        System.out.println(Leader(arr));
    }
}
