public class practice2 {
    static int  fibo(int n){
        if(n<=1) return n;
        return fibo(n-1)+fibo(n-2);

    }
    public static void main(String[] args) {
        int a=0,b=1,n=5;
        for(int i=0;i<=n;i++){
           System.out.println(fibo(i));
        }
    }
    
}
