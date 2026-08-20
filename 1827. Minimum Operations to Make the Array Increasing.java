class Solution {
    public int minOperations(int[] nums) {
        int operations = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                // Calculate required operations in O(1) time
                int expectedValue = nums[i - 1] + 1;
                operations += expectedValue - nums[i];

 
                nums[i] = expectedValue;
            }
        }

        return operations;
    }
}
