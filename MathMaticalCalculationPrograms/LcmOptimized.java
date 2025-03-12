public class LcmOptimized {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b); // ✅ Correct recursive call
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b); // ✅ Using the LCM formula
    }

    public static void main(String[] args) {
        System.out.println("LCM is: " + lcm(4, 6)); // Output: 12
    }
}
