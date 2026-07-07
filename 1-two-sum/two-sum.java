import java.util.Scanner;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int in[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    in[0]=i;
                    in[1]=j;
                    break;
                }
            }
        }
        return in;
    }
    public static void main(String[]args){
        int nums[] = {2, 7, 11, 15};
        int tar = 9;
        int res[] = new int[2];
        res = twoSum(nums, tar);
        System.out.println();
        for (int i = 0; i < 2; i++) {
            System.out.println(res[i]);
        }
    }
}