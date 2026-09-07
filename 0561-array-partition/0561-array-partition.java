class Solution {
    public int arrayPairSum(int[] nums) {
        /*Arrays.sort(nums);

        int sum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;*/

        Arrays.sort(nums);

        int sum = 0;
        int index = 0;

        for (int num : nums) {
            if (index % 2 == 0) {
                sum += num;
            }
            index++;
        }

        return sum;
    }
}