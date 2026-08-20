import java.util.Arrays;

class Solution {
    public boolean closeStrings(String word1, String word2) {

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (char c : arr1) {
            freq1[c - 'a']++;
        }

        for (char c : arr2) {
            freq2[c - 'a']++;
        }

        // Same characters may exist in both the strings
        for (int i = 0; i < 26; i++) {
            if ((freq1[i] == 0 && freq2[i] != 0) ||
                (freq1[i] != 0 && freq2[i] == 0)) {
                return false;
            }
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);
    }
}