// Last updated: 7/9/2026, 10:04:54 AM
class Solution {
    public int findLHS(int[] nums) {
         Arrays.sort(nums);

        int left=0;
        int min=nums[0];
        int max=nums[0];
        int length=0;
        for(int right=0; right<nums.length; right++){
            max=nums[right];
            if(max-min==1){
                length=Math.max(right-left+1, length);
            }            
            while(max-min>1){
                left++;
                min=nums[left];
            }
        }        
        return length;
    }
}