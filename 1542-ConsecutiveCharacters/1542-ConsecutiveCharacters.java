// Last updated: 7/9/2026, 10:03:01 AM
class Solution {
    public int maxPower(String s) {
        int n = s.length() - 1;
        int max = 1;
        int temp = 1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == s.charAt(i + 1))
                temp++;
            else {
                max = Math.max(temp, max);
                temp = 1;
            }
        }
        max = Math.max(temp, max);
        return max;
    }
}