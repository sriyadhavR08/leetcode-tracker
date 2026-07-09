// Last updated: 7/9/2026, 10:02:39 AM
class Solution {
    public int largestAltitude(int[] gain) {
        int alt=0;
        int max=0;
        for(int i=0;i<gain.length;i++){
            alt=alt+gain[i];
            if(alt>max){
                max=alt;
            }
        }
        return max;
    }
}