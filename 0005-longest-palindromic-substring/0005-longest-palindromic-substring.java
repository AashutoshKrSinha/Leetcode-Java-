class Solution {
    public String longestPalindrome(String s) {
        int start = 0, maxLen = 1;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= 1; j++) {

                int left = i;
                int right = i + j;

                while (left >= 0 &&
                       right < s.length() &&
                       s.charAt(left) == s.charAt(right)) {

                    if (right - left + 1 > maxLen) {
                        maxLen = right - left + 1;
                        start = left;
                    }

                    left--;
                    right++;
                }
            }
        }

        return s.substring(start, start + maxLen);
    }
}