class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int idx;
            if (nums[i] > 0) {
                idx = (i + nums[i]) % n;
            } else if (nums[i] < 0) {
                idx = (i + nums[i]) % n;
                if (idx < 0) idx += n;
            } else {
                idx = i;
            }
            result[i] = nums[idx];
        }
        return result;
    }
}
