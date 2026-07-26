import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int need = target - nums[i];

            if (numbers.containsKey(need)) {
                return new int[]{numbers.get(need), i};
            }

            numbers.put(nums[i], i);
        }

        return new int[0];
    }
}
