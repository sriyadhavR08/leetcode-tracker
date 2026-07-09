// Last updated: 7/9/2026, 10:03:33 AM
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++)
            if (nums[i] < 0 && k > 0) {
                nums[i] *= -1;
                k--;
            }
        Arrays.sort(nums);
        if (k % 2 == 1)
            nums[0] *= -1;
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += nums[i];
        return sum;
    }
}