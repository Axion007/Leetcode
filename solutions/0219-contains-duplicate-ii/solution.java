class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int compliment=nums[i];
            if(map.containsKey(compliment)&& Math.abs(map.get(nums[i])-i)<=k){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
