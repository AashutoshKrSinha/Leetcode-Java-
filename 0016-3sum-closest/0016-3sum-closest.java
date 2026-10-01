import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (Math.abs(target - sum) < Math.abs(target - closest)) {
                    closest = sum;
                }

                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return sum;
                }
            }
        }

        return closest;
    }
}

/* Brute Force 
class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {

            for (int j = i + 1; j < nums.length - 1; j++) {

                for (int k = j + 1; k < nums.length; k++) {

                    int sum = nums[i] + nums[j] + nums[k];

                    // Find the difference between target and current sum
                    int currentDiff = target - sum;
                    currentDiff = currentDiff < 0 ? -currentDiff : currentDiff;

                    // Find the difference between target and closest sum
                    int closestDiff = target - closestSum;
                    closestDiff = closestDiff < 0 ? -closestDiff : closestDiff;

                    // If current sum is closer to target, update closestSum
                    if (currentDiff < closestDiff) {
                        closestSum = sum;
                    }
                }
            }
        }

        return closestSum;
    }
} */