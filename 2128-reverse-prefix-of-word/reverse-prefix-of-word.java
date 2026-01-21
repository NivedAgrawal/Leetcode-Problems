class Solution {
    public String reversePrefix(String word, char ch) {
        int i = word.indexOf(ch);
        if(i==-1) return word;
        StringBuilder sb = new StringBuilder(word.substring(0,i+1));
        int len = word.length();
        String ans = sb.reverse().toString()+word.substring(i+1,len);
        return ans;
    }
}