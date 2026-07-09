// Last updated: 7/9/2026, 10:02:24 AM
class Solution 
{
    public boolean isPrefixString(String s, String[] words) 
    {
        int strIndex = 0;
        int total = 0;
        for(int i = 0; i < words.length; i++)
        {
            total = total + words[i].length();

        }
        if(s.length() > total)
        {
            return false;
        }
        for(int i = 0; i < words.length && strIndex < s.length(); i++)
        {
           for(int j = 0; j < words[i].length(); j++)
           {
                if(s.charAt(strIndex) != words[i].charAt(j))
                {
                    return false;
                }
                strIndex++;
                if(strIndex >= s.length() && j != words[i].length() - 1)
                {
                    return false;
                }

           }
        }
        return true;    
    }
}