// Last updated: 7/9/2026, 10:05:02 AM
class Solution {
    public int arrayPairSum(int[] nums) {
         Arrays.sort(nums);  
        int sum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }
}