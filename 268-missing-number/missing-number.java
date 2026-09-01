class Solution {
    public int missingNumber(int[] nums) {
        int l=nums.length;
        int ans=l;
        for(int i=0;i<l;i++){
            ans^=i^nums[i];
        }
        return ans;
    }
}