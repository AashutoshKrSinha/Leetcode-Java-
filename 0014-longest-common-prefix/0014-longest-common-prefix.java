class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++){
            String current = strs[i];
            String temp = "";

            int j = 0;

            while (j < prefix.length() && j < current.length()){
                if(prefix.charAt(j) == current.charAt(j)){
                    temp = temp + prefix.charAt(j);
                    j++;
                }
                else{
                    break;
                }
            }

            prefix = temp;
            if(prefix.equals("")){
                return "";
            }
        }
        return prefix;
    }
}