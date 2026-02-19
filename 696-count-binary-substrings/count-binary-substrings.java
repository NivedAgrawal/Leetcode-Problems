class Solution {
    public int countBinarySubstrings(String s) {
        int ans=0,z=1,a=0;
        for(int i=1;i<s.length();i++){
           if(s.charAt(i)==s.charAt(i-1)) z++;
           else{
            ans += Math.min(z,a);
            a = z;
            z=1;
           }
        }
        ans += Math.min(z,a);
        return ans;
    }
}