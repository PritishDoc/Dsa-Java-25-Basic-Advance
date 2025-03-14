public class PrimeFactorEfficient {
    static void pf(int n){
        if(n<=1) return;
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                System.out.println(i);
                n=n/i;
            }
        }
        if(n>1) System.out.println(n);
    }
    public static void main(String[] args) {
        int n=84;
        pf(n);
    }
    
}
