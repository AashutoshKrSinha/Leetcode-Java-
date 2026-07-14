class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0;
        int ans = 0;
        int numbers = 0;

        for(int right = 0;  right<nums.length; right++){
            numbers += nums[right];

            while(right - left + 1 != numbers){
                numbers -= nums[left];
                left++;
            }
            ans = Math.max(ans, right - left +1);
        }
        return ans; 
    }
}