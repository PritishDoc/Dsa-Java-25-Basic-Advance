public class Lcm {
    static int lcm(int a, int b) {
        int result = Math.max(a, b); // Start from the maximum of a and b
        
        while (true) { // Keep increasing result until it is divisible by both a and b
            if (result % a == 0 && result % b == 0) {
                return result;
            }
            result++; // Increment result to check the next number
        }
    }

    public static void main(String[] args) {
        System.out.println("LCM is: " + lcm(4, 6)); // Output: 12
    }
}
