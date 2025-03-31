import java.util.LinkedList;

public class RepeatedCharRemove {
    public static void main(String[] args) {
        String str = "banana";
        char[] arr = str.toCharArray(); 
        LinkedList<Character> newarr = new LinkedList<>();

        for (char ch : arr) {
            if (!newarr.contains(ch)) { 
                newarr.add(ch);
            }
        }

        
        char[] Chars = new char[newarr.size()];
        for (int i = 0; i < newarr.size(); i++) {
            Chars[i] = newarr.get(i);
        }

      
        System.out.println("not repeted  char in string : " + new String(Chars));
    }
}
