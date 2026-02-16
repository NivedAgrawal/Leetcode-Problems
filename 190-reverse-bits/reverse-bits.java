class Solution {
    public int reverseBits(int n) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
        int d = 32 - sb.length();
        sb.reverse();
        while(d>0){
            sb.append('0');
            d--;
        }
        return Integer.parseInt(sb.toString(),2);
    }
}