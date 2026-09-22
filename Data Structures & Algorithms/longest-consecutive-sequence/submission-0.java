class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int[] numss = Arrays.stream(nums).distinct().toArray();
        int s = 0, i = 1;
        int res = 0;
        while(i < numss.length) {
            if(numss[i] - 1 == numss[i-1]) {
                i++;
            } else {
                res = Math.max(i - s, res);
                s = i++;
            }
        }
        res = Math.max(i - s, res);
        return res;
    }
}
