// Last updated: 7/9/2026, 10:05:37 AM
class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;

        while (xor > 0) {
            if (xor % 2 == 1) {
                count++;
            }
            xor = xor / 2;
        }

        return count;
    }
}