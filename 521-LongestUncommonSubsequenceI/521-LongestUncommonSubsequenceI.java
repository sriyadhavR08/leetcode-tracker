// Last updated: 7/9/2026, 10:05:09 AM
class Solution {
    public int findLUSlength(String a, String b) {
         if (a.equals(b))
            return -1;
        return Math.max(a.length(), b.length());
    }
}