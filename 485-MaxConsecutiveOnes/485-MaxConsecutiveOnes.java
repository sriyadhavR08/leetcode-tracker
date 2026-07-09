// Last updated: 7/9/2026, 10:05:24 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=0;
        int count=0;
        for(int n:nums){
            if(n==0){
                count=0;
            }
            else{
                count++;
            }
            if(count>res){
                res=count;
            }
        }
        return res;
    }
}