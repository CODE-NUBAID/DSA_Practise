class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, target, new ArrayList<>(), res, candidates);
        return res;
    }

    private void backtrack(int start, int remain, List<Integer> path, List<List<Integer>> res, int[] candidates) {
        if (remain == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        if (remain < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            path.add(candidates[i]);
        
            backtrack(i, remain - candidates[i], path, res, candidates);
            path.remove(path.size() - 1);
        }
    }
}
