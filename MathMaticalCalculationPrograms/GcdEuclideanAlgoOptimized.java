public class GcdEuclideanAlgoOptimized {
    static int optimized(int a,int b){
        if(b==0){
            return a;
        }
        else{ return optimized(b,a%b);}
    }
    public static void main(String[] args) {
        System.out.println("The gcd is : "+optimized(12, 15));
    }
}
