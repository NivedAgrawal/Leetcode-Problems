class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int slen = s.length();
        int plen = p.length();
        char[] c = p.toCharArray();
        Arrays.sort(c);
        String psorted = new String(c);
        for (int i = 0; i <= slen-plen; i++) {
            String sub = s.substring(i, i+plen);
            char[] d = sub.toCharArray();
            Arrays.sort(d);
            String ssorted = new String(d);
            if (ssorted.equals(psorted))
                list.add(i);
        }
        return list;
    }
}