public class PrimeFactor {
    static int isPrime(int n){
        if(n<=1) return 0;
        if(n<=3) return 1;
        if(n%2==0 || n%3==0) return 0;
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int n=12;
        for(int i=2;i<=n;i++){
            if(isPrime(i)==1){
                int x=i;
                while(n%x==0){
                    System.out.print(i+" ");
                    x=x*i;
                }
            }
        }
    }
}
