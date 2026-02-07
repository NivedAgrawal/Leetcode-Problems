class Solution {
    public boolean checkString(String s) {
        int b=0;
        for(char c : s.toCharArray()){
            if(c=='b') b++;
            if(c=='a' && b>0) return false;
        }
        return true;
    }
}