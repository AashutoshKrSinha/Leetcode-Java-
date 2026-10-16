class Solution {
    public String longestPalindrome(String s) {

        int n = s.length();
        String ans = "";

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j <= n; j++){
                String sub = s.substring(i , j);

                if (isPalindrome(sub)){
                    if (sub.length() > ans.length()){
                        ans = sub;
                    }
                }
            }
        }
        return ans;
    }

    public boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;

        while (i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}


        /*int start = 0, maxLen = 1;

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
        */