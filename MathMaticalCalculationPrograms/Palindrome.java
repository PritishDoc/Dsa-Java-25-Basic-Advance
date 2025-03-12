public class Palindrome {
    static boolean palind(int x) {
        int rev = 0;
        int org = x;
        while (x != 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x /= 10;
        }
        return rev == org; // Return true or false directly
    }

    public static void main(String[] args) {
        int n = 55555;

        if (palind(n)) { // No need to compare with 1, since it returns boolean
            System.out.println("It's a palindrome number: " + n);
        } else {
            System.out.println("It's not a palindrome number.");
        }
    }
}
