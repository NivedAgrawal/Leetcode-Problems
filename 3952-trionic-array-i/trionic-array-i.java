class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 4) return false;

        int p = -1, q = -1;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] < nums[i + 1]) continue;
            p = i;
            break;
        }
        if (p <= 0) return false;
        for (int i = p; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) continue;
            q = i;
            break;
        }
        if (q <= p) return false;
        for (int i = q; i < n - 1; i++) {
            if (nums[i] >= nums[i + 1]) return false;
        }

        return true;
    }
}
