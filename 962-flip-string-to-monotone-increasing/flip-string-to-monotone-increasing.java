class Solution {
    public int minFlipsMonoIncr(String s) {
        int a=0,ans = 0;
        for(char c:s.toCharArray()){
            if(c=='1') a++;
            else if(a>0){
                ans++;
                a--;
            }
        }
        return ans;
    }
}