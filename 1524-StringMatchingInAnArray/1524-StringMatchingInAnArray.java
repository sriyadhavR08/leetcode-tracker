// Last updated: 7/9/2026, 10:03:04 AM
class Solution {
    public List<String> stringMatching(String[] words) {
       List<String> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    ans.add(words[i]);
                    break;
                }
            }
        }

        return ans;  
    }
}