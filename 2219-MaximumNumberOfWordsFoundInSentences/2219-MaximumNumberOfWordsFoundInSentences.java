// Last updated: 7/9/2026, 10:02:14 AM
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            String[] words=sentences[i].split(" ");
            if(words.length>max){
                max=words.length;
            }
           
        }
        return max;
    }
}