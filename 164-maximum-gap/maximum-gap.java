
class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;

        if (n < 2) return 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        if (min == max) return 0;

        int size = Math.max(1, (max - min + n - 2) / (n - 1));
        int count = (max - min) / size + 1;

        int[] bucketMin = new int[count];
        int[] bucketMax = new int[count];
        boolean[] used = new boolean[count];

        for (int num : nums) {
            int index = (num - min) / size;

            bucketMin[index] = used[index]
                ? Math.min(bucketMin[index], num) : num;

            bucketMax[index] = used[index]
                ? Math.max(bucketMax[index], num) : num;

            used[index] = true;
        }

        int ans = 0;
        int prev = min;

        for (int i = 0; i < count; i++) {
            if (used[i]) {
                ans = Math.max(ans, bucketMin[i] - prev);
                prev = bucketMax[i];
            }
        }

        return ans;
    }
}
