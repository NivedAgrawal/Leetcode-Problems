class Solution {
    public int balancedStringSplit(String s) {
        int ans=0,l=0,r=0;
        for(char c:s.toCharArray()){
            if(c=='R') r++;
            else l++;
            if(r==l) ans++;
        }
        return ans;
    }
}