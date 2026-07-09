// Last updated: 7/9/2026, 10:02:19 AM
class Solution {
    public int countValidWords(String sentence) {
        int count = 0;
        String[] strarr = sentence.split(" ");   // split String into seperate words
        
        for(String str: strarr){
            boolean temp = true;
            int hypen = 0;
            
            for(int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);
                // if character is alphabet do nothing
                if(ch >= 'a' && ch <= 'z'){
                    continue;
                }
                // if character is hypen check its frequency & character before and after it
                else if(ch == '-'){
                    hypen++;
                    if(hypen > 1){
                        temp = false;
                        break;
                    }
                    if(i > 0 && (str.charAt(i - 1) >= 'a' && str.charAt(i - 1) <= 'z') && 
                      (i + 1 < str.length() && (str.charAt(i + 1) >= 'a' && str.charAt(i + 1) <= 'z'))){
                        ;
                    }
                    else{
                        temp = false;
                        break;
                    }
                }
                // if character is punctuation check if it is at last index
                else if(ch == ',' || ch == '.' || ch == '!'){
                    if(i != str.length() - 1){
                        temp = false;
                        break;
                    }    
                }
                else{
                    temp = false;
                    break;
                }
            }
            // increase count if character if temp is true & string size is greater than zero
            if(temp && str.length() > 0)    count++;
        }
        return count;
    }
}