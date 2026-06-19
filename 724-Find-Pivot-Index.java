class Solution {
    public int pivotIndex(int[] arr) {
        int totalSum = 0;
        for(int i = 0; i < arr.length ; i ++){
            totalSum += arr[i];
            
        }
        // totalSum = 28
        int leftSum = 0;
        for(int i = 0; i < arr.length; i ++){
            int rightSum = totalSum - leftSum  - arr[i];
            if (rightSum == leftSum){
                return i;
            }
            leftSum += arr[i];
        }
        return - 1;
    }
}