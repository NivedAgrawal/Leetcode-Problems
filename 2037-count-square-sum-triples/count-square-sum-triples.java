class Solution {
    public int countTriples(int n) {
        int ans = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
            int m = (int) Math.sqrt((i*i)+(j*j));
            if((m*m == (i*i) + (j*j)) && m<=n) ans++;
            }
        }
        return ans;
    }
}