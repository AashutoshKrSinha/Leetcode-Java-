class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0){
            return 0;
        }

        int slow = 0;
        int fast = 1;

        while (fast < nums.length){
            if(nums[slow] != nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }
}

/*Brute Force 

int n = nums.length;

        for (int i = 0; i < n - 1; i++){
            for (int j = i + 1; j < n; j++){
                if(nums[i] == nums[j]){
                    for(int k = j; k < n - 1; k++){
                        nums[k] = nums[k + 1];
                    }
                    n--;
                    j--;
                }
            }
        }
        return n;
*/

