public class RepeatedCharRemove2 {
    public static void main(String[] args) {
        String str = "banana";
        String result = removeDuplicates(str);
        System.out.println("Non-repeated characters in string: " + result);
    }

    public static String removeDuplicates(String str) {
        char[] chars = str.toCharArray();
        String result = "";

        for (int i = 0; i < chars.length; i++) { 
            boolean isDuplicate = false;

            
            for (int j = 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    isDuplicate = true;
                    break;
                }
            }

           
            if (!isDuplicate) {
                result += chars[i]; 
            }
        }

        return result;
    }
}
