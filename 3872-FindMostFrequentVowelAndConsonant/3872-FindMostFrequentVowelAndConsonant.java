// Last updated: 7/9/2026, 10:01:49 AM
class Solution {
    public int maxFreqSum(String s) {
        int vowelMax = 0;
        int consonantMax = 0;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ch) {
                    count++;
                }
            }

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                if (count > vowelMax) {
                    vowelMax = count;
                }
            } else {
                if (count > consonantMax) {
                    consonantMax = count;
                }
            }
        }

        return vowelMax + consonantMax;
    }
}