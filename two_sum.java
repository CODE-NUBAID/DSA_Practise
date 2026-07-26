import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] numWithIndex = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            numWithIndex[i][0] = nums[i];
            numWithIndex[i][1] = i;
        }

        Arrays.sort(numWithIndex, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < nums.length; i++) {
            int complement = target - numWithIndex[i][0];
            
            // Search for complement in the rest of the array
            int low = i + 1, high = nums.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (numWithIndex[mid][0] == complement) {
                    return new int[] { numWithIndex[i][1], numWithIndex[mid][1] };
                } else if (numWithIndex[mid][0] < complement) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return new int[] {};
    }
}
