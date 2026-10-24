class Solution {
    public String convertToTitle(int columnNumber) {

        String answer = "";

        while (columnNumber > 0) {
            columnNumber--;

            int remainder = columnNumber % 26;

            char character = (char) ('A' + remainder);

            answer = character + answer;

            columnNumber = columnNumber / 26;
        }

        return answer;
    }
}