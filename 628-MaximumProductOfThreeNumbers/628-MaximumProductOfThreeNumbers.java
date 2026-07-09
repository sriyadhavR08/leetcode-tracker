// Last updated: 7/9/2026, 10:04:48 AM
class Solution {
    public int maximumProduct(int[] nums) {

        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {

                if(nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        int n = nums.length;

        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        int product2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(product1, product2);
    }
}