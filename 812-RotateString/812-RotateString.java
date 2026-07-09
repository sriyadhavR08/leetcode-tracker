// Last updated: 7/9/2026, 10:04:04 AM
class Solution {
    public boolean rotateString(String s, String goal) {
       if(s.length()!=goal.length()) return false;
       String a=s+s;
       if(a.contains(goal)) return true;
       return false; 
    }
}