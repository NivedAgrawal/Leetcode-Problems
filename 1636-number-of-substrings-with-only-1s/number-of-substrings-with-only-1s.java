class Solution {
    public int numSub(String s) {
        int count = 0;
        int ans = 0;
        for(int l=0;l<s.length();l++){
            char c = s.charAt(l);
            if(c=='1'){
                count++;
                ans = (ans + count)%1000000007;
            }
            else{
                count = 0;
            }
        }
        return ans%1000000007;
    }
}