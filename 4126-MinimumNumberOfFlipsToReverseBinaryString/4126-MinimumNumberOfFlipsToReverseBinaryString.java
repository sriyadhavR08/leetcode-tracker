// Last updated: 7/9/2026, 10:01:42 AM
class Solution {
    public int minimumFlips(int n) {
        String s = Long.toBinaryString(n);
        int len = s.length();
        int count = 0;
        for(int i = 0; i < len; i++) {
            if(s.charAt(i) != s.charAt(len - 1 - i)) count++;
        }
        return count;
    }
}