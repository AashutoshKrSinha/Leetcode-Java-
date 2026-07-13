import java.util.Arrays;

class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length;
        int coins = 0;

        int rounds = n / 3;
        int index = n - 2; // second largest

        for (int i = 0; i < rounds; i++) {
            coins += piles[index];
            index -= 2;
        }

        return coins;
    }
}