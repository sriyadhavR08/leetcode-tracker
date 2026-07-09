// Last updated: 7/9/2026, 10:01:55 AM
class Solution {
    public String maximumOddBinaryNumber(String s) {
        int zeroCnt = 0;
        int oneCnt = 0;
        int n = s.length();

        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '0'){
                zeroCnt++;
            } else {
                oneCnt++;
            }
        }

        oneCnt--;

        StringBuilder sb = new StringBuilder();

        while(oneCnt > 0){
            sb.append('1');
            oneCnt--;
        }

        while(zeroCnt > 0){
            sb.append('0');
            zeroCnt--;
        }
        
        sb.append('1');

        return sb.toString();
    }
}