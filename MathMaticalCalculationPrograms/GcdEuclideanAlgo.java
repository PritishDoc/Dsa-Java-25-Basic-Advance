public class GcdEuclideanAlgo {
    static int gcd(int a,int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }

        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println("The gcd is : "+gcd(12, 15));
    }
}
