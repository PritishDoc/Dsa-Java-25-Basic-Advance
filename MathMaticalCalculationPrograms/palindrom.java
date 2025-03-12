public class palindrom {
    static int palindrom(int n){
        int temp=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            return 1;
        }
        else{
            return 0;
        }
    }
    
}
