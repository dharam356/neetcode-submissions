class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int zc = 0;
        int nzp = 1;
        int zi = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zc++;
                zi = i;
            } else {
                nzp *= nums[i];
            }
        }
        if(zc == 0) {
            for(int i = 0; i < nums.length; i++) {
                res[i] = nzp / nums[i];
            }
        } else if (zc == 1) res[zi] = nzp;

        return res;
    }
}  
