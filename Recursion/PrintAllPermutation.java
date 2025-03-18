package Recursion;

public class PrintAllPermutation {
    void printAllPermutation(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String left=s.substring(0,i);
            String right=s.substring(i+1);
            String rest=left+right;
            printAllPermutation(rest, ans+ch);
        }
    }
    public static void main(String[] args) {
        PrintAllPermutation p=new PrintAllPermutation();
        p.printAllPermutation("abc", "");
    }   
}
