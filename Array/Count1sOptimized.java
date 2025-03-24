public class Count1sOptimized {
    static int max(int arr[]){
        int res=0;
        int curr=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                curr=0;
            }
            else{
                curr++;
                res=Math.max(curr, res);
            }
        }
        return res;


    }   
    public static void main(String[] args) {
        int arr[]={1,0,1,1,1,0,1,1,0,1};
        System.out.println(max(arr));
    }
    
}
