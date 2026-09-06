class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set =new HashSet<>();
        HashSet<Integer> res=new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        for(int i:nums2){
            if(set.contains(i)){
                res.add(i);
            }
        }
        int[] ans=new int[res.size()];
        int i=0;
        for(int j:res){
            ans[i++]=j;
        }
        return ans;
    }
}