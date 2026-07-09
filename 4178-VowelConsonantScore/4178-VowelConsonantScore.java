// Last updated: 7/9/2026, 10:01:40 AM
class Solution {
    public int vowelConsonantScore(String s) {
        String vowel = "aeiou";
        String consonent = "bcdfghjklmnpqrstvwxyz";
        int vow = 0;
        int cons = 0;

        for(int i=0;i<s.length();i++)
        {
            if(vowel.indexOf(s.charAt(i))!=-1)
            {
                vow++;
            }
            if(consonent.indexOf(s.charAt(i))!=-1)
            {
                cons++;
            }
        }
        if (cons == 0)
        {
            return 0;
        }
    
        return vow/cons;
    }
}