class Solution {
    public int minimumDeletions(String s) {
        char[] chr = s.toCharArray();
        int res=0,b=0;
        for(char c:chr){
            if(c=='b') b++;
            else if(b>0){
                res++;
                b--;
            }
        }
        return res;
    }
}