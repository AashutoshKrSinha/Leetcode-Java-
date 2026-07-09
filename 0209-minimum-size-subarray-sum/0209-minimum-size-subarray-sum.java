class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0, high = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        while (high < nums.length) {
            sum += nums[high];
            while (sum >= target) {
                minLen = Math.min(minLen, high - low + 1);
                sum -= nums[low];
                low++;
            }

            high++;
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
