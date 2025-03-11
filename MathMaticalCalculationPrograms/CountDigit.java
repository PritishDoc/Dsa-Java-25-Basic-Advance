public class CountDigit{
    static int cd(int n){
        int ans=0;
        while(n>0){
            n/=10;
            ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=85858;
        System.out.println("Total num of digit is : "+cd(n));
    }
}

//In this program time complexity is Theeta(n)/O(n) bcz it grows based on size of num 
//space is O(1) mean it take one constant variable space no need to create extra array in space or something else