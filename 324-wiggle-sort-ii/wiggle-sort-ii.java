
import java.util.Arrays;

class Solution {
    public void wiggleSort(int[] nums) {
        int[] arr = nums.clone();
        Arrays.sort(arr);

        int n = nums.length;
        int mid = (n + 1) / 2;
        int end = n;

        for (int i = 0; i < n; i += 2) {
            nums[i] = arr[--mid];
        }

        for (int i = 1; i < n; i += 2) {
            nums[i] = arr[--end];
        }
    }
}
