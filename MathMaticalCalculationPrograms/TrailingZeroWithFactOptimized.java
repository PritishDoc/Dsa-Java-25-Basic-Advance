public class TrailingZeroWithFactOptimized {
    static int countZero(int n){
        int result=0;
        for(int i=5;i<=n;i=i*5){
            result+=n/i;

        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Total zero in the fact is : "+countZero(100));
    }
    
}
