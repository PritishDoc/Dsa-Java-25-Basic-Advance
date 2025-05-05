public class FactorialNum {
    static int fact(int x){
        int fact=1;
        for(int i=1;i<=x;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int n=5;




        //print 
        System.out.println("The factorial num is: "+fact(n));
    }
}
//T(n)=O(n);
//sF(n)=O(n);