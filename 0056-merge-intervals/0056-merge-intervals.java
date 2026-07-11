import java.util.*;

class Solution {
    
    public int[][] merge(int[][] intervals) {
        
        if (intervals == null || intervals.length == 0) {
            return new int[0][0];
        }

        // Step 1: Sort intervals based on start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Temporary array to store result
        int[][] temp = new int[intervals.length][2];
        int index = 0;

        // Take first interval
        temp[index] = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            
            // If overlapping
            if (intervals[i][0] <= temp[index][1]) {
                temp[index][1] = Math.max(temp[index][1], intervals[i][1]);
            } 
            else {
                // Move to next position
                index++;
                temp[index] = intervals[i];
            }
        }

        // Return only filled intervals
        return Arrays.copyOf(temp, index + 1);
    }
}