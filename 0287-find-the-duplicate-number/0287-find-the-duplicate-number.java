import java.util.HashSet;

public class Solution {

    public int findDuplicate(int[] param_1) {
        
        HashSet<Integer> set = new HashSet<>();

        for (int num : param_1) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;
    }
}