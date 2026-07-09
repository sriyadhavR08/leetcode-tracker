// Last updated: 7/9/2026, 10:02:08 AM
class Solution {
    public int countPrefixes(String[] words, String s) {
        
        int count = 0;

        for(String w : words){

            if(s.startsWith(w)){
                count++;
            }
        }

        return count;
    }
}