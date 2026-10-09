class Solution {
    public int firstMissingPositive(int[] nums) {
        /*int n = nums.length;

        for (int i = 1; i <= n + 1; i++){
            boolean found = false;

            for(int j = 0; j < n; j++){
                if(nums[j] == i){
                    found = true;
                    break;
                    }
                }
                if (found == false){
                    return i;
            }
        }
        return n + 1;*/

        int n = nums.length;
        int i = 0;

        while (i < n) {
            int correct = nums[i] - 1;

            if (nums[i] > 0 && nums[i] <= n &&
                nums[i] != nums[correct]) {

                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;

            } else {
                i++;
            }
        }

        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }
}
