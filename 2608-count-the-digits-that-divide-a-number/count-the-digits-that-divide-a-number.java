class Solution {
    public int countDigits(int num) {
        int n = num,ans = 0;
        while(n!=0){
            int k = n%10;
            if(k>0 && num%k==0) ans++;
            n = n/10;
        }
        return ans;
    }
}