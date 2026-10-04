class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int i = 0;

        /*for (int i = 0; i < n; i++){
            if (nums[i] == target){
                return i;
            }
        }

        return -1;*/

        while (i < n){
            if (nums[i] == target){
                return i;
            }
                i++;
        }
        return -1;
    }
}