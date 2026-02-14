class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i=1;i<nums.length;i++){
          if(nums[i-1]==nums[i]){
            nums[i] +=1;
            ans += 1;
          }
          else if(nums[i-1]>nums[i]){
            int temp = nums[i];
            nums[i] = nums[i-1]+1;
            ans += nums[i]-temp;
          }
        }
        return ans;
    }
}