class Solution {
    public int binaryGap(int n) {
        String s = Integer.toBinaryString(n);
        int d = 0+1,max=0,one=0;
        for(char c:s.toCharArray()){
            if(c=='1') {
                one++;
                if(one>1 && d>1){
                    max = Math.max(d,max);
                }
                else if(one==2) max=1;
                d=1;
                }
            else{
                d++;
                one = 1;
            }
        }
        return max;
    }
}