// Last updated: 7/9/2026, 10:04:24 AM
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        final int n=bits.length;
        int i=0;
        while(i<n-1){
            i+=1+bits[i];
        }
        return i==n-1;
    }
}