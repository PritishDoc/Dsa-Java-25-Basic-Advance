class Solution {
    public static int findDigit(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public int countLargestGroup(int n) {
        int arr[]=new int [37];//max digit sum 9+9+9+9=36

        int maxsize=0;
        int count =0;

        for(int i=1;i<=n;i++){
            int sumdigit=findDigit(i);
            arr[sumdigit]++;

            if(arr[sumdigit]==maxsize){
                count++;
            }
            else if(arr[sumdigit]>maxsize){
                maxsize=arr[sumdigit];
                count=1;
            }
        }
        return count;
    }
}