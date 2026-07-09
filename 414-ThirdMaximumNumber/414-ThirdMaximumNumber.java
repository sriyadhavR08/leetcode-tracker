// Last updated: 7/9/2026, 10:05:46 AM
class Solution {
    public int thirdMax(int[] nums) {
         for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        int count = 1;
        int prev = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != prev) {
                count++;
                prev = nums[i];

                if (count == 3) {
                    return nums[i];
                }
            }
        }

        return nums[0];
    }
}