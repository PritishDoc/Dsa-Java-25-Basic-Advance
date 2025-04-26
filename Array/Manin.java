class Solution {

    // Method to find the digit sum of a number
    public static int findDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Main logic to count largest group
    public int countLargestGroup(int n) {
        int[] arr = new int[37]; // Possible digit sum from 1 to 36
        int maxsize = 0;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int sumdigit = findDigit(i);
            arr[sumdigit]++;

            if (arr[sumdigit] == maxsize) {
                count++;
            } else if (arr[sumdigit] > maxsize) {
                maxsize = arr[sumdigit];
                count = 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 13;
        System.out.println("Result: " + s.countLargestGroup(n));
    }
}
