// Last updated: 7/9/2026, 10:02:32 AM
class Solution {
    public int secondHighest(String s) {
        int fir = -1, sec = -1;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                if (ch > fir) {
                    sec = fir;
                    fir = ch;
                } else if (ch != fir && ch > sec) {
                    sec = ch;
                }
            }
        }

        return sec == -1 ? -1 : sec - '0';
    }
}