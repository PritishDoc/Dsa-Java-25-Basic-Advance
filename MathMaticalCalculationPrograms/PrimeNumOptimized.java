public class PrimeNumOptimized {

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Prime numbers between 30 and 60:");
        for (int i = 10; i <= 60; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
