class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length + nums2.length;

        //create new array
        int [] nums3 = new int [m];
        //to track index of nums3
        int pos = 0;

        //copy nums1 to nums3
        for (int i = 0; i < nums1.length; i++){
            nums3[pos] = nums1[i];
            pos++;
        }

        //copy nums2 to nums3
        for (int i = 0; i < nums2.length; i++){
            nums3[pos] = nums2[i];
            pos++;
        }

        //sort the array nums3
        for (int i = 0; i < m - 1; i++){
            for (int j = i + 1; j < m; j++){
                if (nums3[i] > nums3[j]){
                    int temp = nums3[i];
                    nums3[i] = nums3[j];
                    nums3[j] = temp;
                }
            }
        }

        //check for median
        if (m % 2 == 1){
            return nums3[m / 2];
        }
        //nums3 length is m so is the array is even find median
        //mums3 length / 2-1 if 4 / 2 then -1 == 2 but position will be 1 
        // nums3 length / 2 if 4 then 4 / 2 == 2 so position 2 
        // 2 + 3 == 5 now 5 / 2.0 then 2.5 opt
        else{
            return (nums3[m / 2 - 1] + nums3 [m / 2]) / 2.0;
        }
        
        
    }
}