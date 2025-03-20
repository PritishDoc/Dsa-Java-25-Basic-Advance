public class LeaderinanArrayOptimized {
    static void LeaderBoard(int arr[]){
        int n=arr.length;
        int cur_Lead=arr[n-1];
        System.out.println(cur_Lead+" ");
        for(int i=n-2;i>=0;i--){
            if(cur_Lead<arr[i]){
                cur_Lead=arr[i];
                System.out.println(cur_Lead+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {20, 30, 30, 89, 76, 91};
        LeaderBoard(arr);
    }
}