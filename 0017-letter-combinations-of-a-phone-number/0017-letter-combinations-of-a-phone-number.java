
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        String[] phone = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        generate(digits, 0, "", phone, ans);

        return ans;
    }

    public void generate(String digits, int index, String current,
                         String[] phone, List<String> ans) {

        if (index == digits.length()) {
            ans.add(current);
            return;
        }

        String letters = phone[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {
            generate(digits, index + 1,
                     current + letters.charAt(i), phone, ans);
        }
    }
}
