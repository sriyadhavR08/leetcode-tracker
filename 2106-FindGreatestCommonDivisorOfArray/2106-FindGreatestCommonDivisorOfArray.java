// Last updated: 7/9/2026, 10:02:23 AM
class Solution {
    public int findGCD(int[] nums) {
        int small=nums[0];
        int large=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<small){
                small=nums[i];
            }
            else if(nums[i]>large){
                large=nums[i];
            }
        }
        while(large % small !=0){
            int rem=large%small;
            large=small;
            small=rem;
        }
        return small;
    }
}