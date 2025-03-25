public class MajorityElementOptimized {
    static int findMajorityElement(int arr[]) {
        int res = 0, count = 1;

        // Step 1: Find a candidate for majority element
        for (int i = 1; i < arr.length; i++) {
            if (arr[res] == arr[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                res = i;
                count = 1;
            }
        }

        // Step 2: Verify if the candidate is actually a majority
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[res] == arr[i]) {
                count++;
            }
        }
        
        if (count > arr.length / 2) {
            return arr[res];
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int arr[] = {8, 8, 6, 6, 6, 4, 6}; 
        System.out.println(findMajorityElement(arr));  // Output should be 6
    }
}
