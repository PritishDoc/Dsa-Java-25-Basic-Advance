public class practice {
    public static void main(String[] args) {
        int n=3456;
        int ans=0;
        while(n>0){
            n/=10;
            ans++;
        }
        System.out.print(ans);
    }
}
