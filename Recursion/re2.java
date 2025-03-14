package Recursion;

public class re2 {
    static int fun(int n){
        if(n==1)return 0;
        else return 1+fun(n/2);
    }
    public static void main(String[] args) {
        int n=13;
        System.out.println(fun(n));
    }
    
}
