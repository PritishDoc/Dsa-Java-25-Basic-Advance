package Recursion;

public class GenerateSubSet {
    void generateSubSet(String s,String curr,int i){
        if(i==s.length()){
            System.out.println(curr);
            return;
        }
        generateSubSet(s, curr, i+1);
        generateSubSet(s, curr+s.charAt(i), i+1);
    }
    public static void main(String[] args) {
        GenerateSubSet g=new GenerateSubSet();
        g.generateSubSet("abc", "", 0);
    }
    
}
