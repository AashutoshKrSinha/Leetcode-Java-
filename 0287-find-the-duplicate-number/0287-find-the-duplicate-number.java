import java.util.ArrayList;
import java.util.HashSet;

public class Solution {

    public int findDuplicate(int[] param_1) {

        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : param_1) {
            arr.add(num);
        }

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                return num;   // duplicate found
            }
            set.add(num);
        }

        return -1; // if no duplicate
    }
}