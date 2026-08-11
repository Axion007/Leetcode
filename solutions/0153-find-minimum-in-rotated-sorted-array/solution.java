class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int ans=-1;
        int end=nums[nums.length-1];
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]<=end){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return nums[ans];
    }
}
