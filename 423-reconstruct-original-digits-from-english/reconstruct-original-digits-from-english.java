class Solution {
    public String originalDigits(String s) {
        int[] f = new int[26];
        int[] c = new int[10];
        for(char ch: s.toCharArray()){
            f[ch-'a']++;
        }
        c[0] = f['z'-'a'];
        c[8] = f['g'-'a'];
        c[2] = f['w'-'a'];
        c[4] = f['u'-'a'];
        c[6] = f['x'-'a'];

        c[1] = f['o'-'a'] - c[0] - c[2] - c[4];
        c[3] = f['h'-'a'] - c[8];
        c[5] = f['f'-'a'] - c[4];
        c[7] = f['s'-'a'] - c[6];
        c[9] = f['i'-'a'] - c[8] - c[6] -c[5];

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<10;i++){
            while(c[i]-->0){
                 sb.append(i);
            }
        }
        return sb.toString();      
    }
}