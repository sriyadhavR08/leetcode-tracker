// Last updated: 7/9/2026, 10:01:37 AM
class Solution {
    public int residuePrefixes(String s) {
        HashSet<Character> uniq = new HashSet<>();
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            uniq.add(s.charAt(i));
            if (uniq.size() == (i + 1) % 3) 
                result++;
            if (uniq.size() > 2) 
                break;
        }

        return result;
    }
}