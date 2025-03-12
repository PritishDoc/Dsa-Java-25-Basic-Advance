public class TrailingZeroWithfact {
    static int countZero(int n){
        int fact=1;
        int result=0;
        for(int i=2;i<=n;i++){
            fact*=i;

            
            while(fact%10==0){
                result++;
                fact/=10;
            }
            
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The zero in factorial is:  "+countZero(20));
    }
    
}
