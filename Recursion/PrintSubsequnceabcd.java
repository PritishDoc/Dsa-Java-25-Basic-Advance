package Recursion;

class PrintSubsequnceabcd {

    static void print(String input, String output) {
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }
        print(input.substring(1), output + input.charAt(0));
        print(input.substring(1), output);
    }

    public static void main(String[] args) {
        String input = "abcd";
        String output = "";
        print(input, output);
    }
}