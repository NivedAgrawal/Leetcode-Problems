class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(String s:nums){
            int k = Integer.parseInt(s,2);
            set.add(k);
        }
        int k = nums[0].length();
        int n = (int) Math.pow(2,k);
        for(int i=0;i<=n;i++){
            if(set.contains(i)) continue;
            String ans = Integer.toBinaryString(i);
            while(ans.length()!=k){
                ans = "0"+ans;
            }
            return ans;
        }
        return "";
    }
}