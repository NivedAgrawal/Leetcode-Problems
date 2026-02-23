class Solution {
    public boolean hasAllCodes(String s, int k) {
        int len = s.length();
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<=len-k;i++){
            String sub = s.substring(i,i+k);
            set.add(sub);
        }
        return set.size() ==  Math.pow(2,k);
    }
}