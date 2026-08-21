class Solution {
    public int maximumCount(int[] nums) {
        int negCount = lowerBound(nums, 0);
        int posCount = nums.length - lowerBound(nums, 1);
        
        return Math.max(negCount, posCount);
    }

    private int lowerBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
