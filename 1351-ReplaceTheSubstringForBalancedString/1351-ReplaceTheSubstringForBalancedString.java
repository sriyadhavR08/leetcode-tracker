// Last updated: 7/9/2026, 10:03:13 AM
class Solution {
    public int balancedString(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'A']++;
        }
        int n = s.length();
        int res = n;
        int k = n / 4;
        int left = 0;
        for(int right = 0; right < n; right++){
            freq[s.charAt(right) - 'A']--;   // Removing right char from remaining pool
            // Check if remaining outside window is already balanced
            while(left < n && freq['Q' - 'A'] <= k && freq['W' - 'A'] <= k && freq['E' - 'A'] <= k && freq['R' - 'A'] <= k){
                res = Math.min(res, right - left + 1); // Update min window
                freq[s.charAt(left) - 'A']++; // Put back char as left shrinks
                left++;
            }
        }
        return res;
    }
}