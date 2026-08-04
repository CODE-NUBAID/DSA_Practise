class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int insertIndex = 1; // Pointer for the next unique position

        for (int i = 1; i < nums.length; i++) {
            // Found a new unique element
            if (nums[i] != nums[insertIndex - 1]) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }

        return insertIndex;
    }
}
