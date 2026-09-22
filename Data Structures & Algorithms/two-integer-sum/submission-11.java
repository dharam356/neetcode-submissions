class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int i = nums.length - 1;
        while(i >= 0) {
            int rest = target - nums[i];
            if(hmap.containsKey(rest)) {
                return new int[] {i, hmap.get(rest)};
            } else {
                hmap.put(nums[i], i--);
            }
        }
        return new int[] {0, 0};
    }
}
