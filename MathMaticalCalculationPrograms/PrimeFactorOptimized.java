public class PrimeFactorOptimized {
    static void pf(int n){
        if(n<=1) return;
        while(n%2==0){
            System.out.println(2);
            n=n/2;
        }
        while(n%3==0){
            System.out.println(3);
            n=n/3;
        }
        for(int i=5;i*i<=n;i=i+6){
            while(n%i==0){
                System.out.println(i);
                n=n/i;
            }
            while(n%(i+2)==0){
                System.out.println(i+2);
                n=n/(i+2);
            }
        }
        if(n>3) System.out.println(n);
    }
    public static void main(String[] args) {
        int n=84;
        pf(n);
    }
    
}
