class Solution {
    public boolean check(int[] nums) {
        boolean dDrop = false;
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                if(dDrop){
                    return false;
                }
                dDrop = true;
            }
        }
        return true;
    }
}
