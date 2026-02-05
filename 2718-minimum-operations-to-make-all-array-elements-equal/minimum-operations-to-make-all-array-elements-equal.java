class Solution {

    public int search(int q, int[] nums) {
        int left = 0, right = nums.length - 1;
        int idx = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < q) {
                idx = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return idx;
    }

    public List<Long> minOperations(int[] nums, int[] queries) {
        Arrays.sort(nums);

        long[] pre = new long[nums.length];
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            pre[i] = sum;
        }

        List<Long> list = new ArrayList<>();

        for (int q : queries) {
            int n = search(q, nums);
            int lc = n + 1;

            long leftCost = (long) q * lc - (n >= 0 ? pre[n] : 0);
            long rightCost =
                    (pre[nums.length - 1] - (n >= 0 ? pre[n] : 0))
                    - (long) q * (nums.length - lc);

            list.add(leftCost + rightCost);
        }
        return list;
    }
}
