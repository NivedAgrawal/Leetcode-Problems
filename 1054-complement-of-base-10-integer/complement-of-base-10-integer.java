class Solution {
    public int bitwiseComplement(int n) {
        String s = Integer.toBinaryString(n);
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='0') c[i] = '1';
            else c[i] = '0';
        }
        String sb = new String(c);
        return Integer.parseInt(sb,2);
    }
}