public class KthLargestElement {
        static int findKthLargest(int nums[],int k){
            int n=nums.length;
            int KthLargestElement=Integer.MIN_VALUE;
            for(int i=0;i<k;i++){
                int LargestIndex=findLargest(nums, n);
                KthLargestElement=nums[LargestIndex];
                nums[LargestIndex]=Integer.MIN_VALUE;
            }

            return KthLargestElement;

        }
        static int findLargest(int nums[],int n){
            int largestIndex=0;
            for(int i=0;i<n;i++){
                if(nums[i]>nums[largestIndex]){
                    largestIndex=i;
                }
            }
            return largestIndex;
        }
    public static void main(String[] args) {
        int[] nums1 = {3,2,1,5,6,4};
        int k1 = 2;
        System.out.println(findKthLargest(nums1, k1)); // Output: 5

        int[] nums2 = {3,2,3,1,2,4,5,5,6};
        int k2 = 4;
        System.out.println(findKthLargest(nums2, k2)); // Output: 4
    }
    }
    

