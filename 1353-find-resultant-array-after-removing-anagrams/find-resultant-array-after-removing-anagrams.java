class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        char[] c = words[0].toCharArray();
        Arrays.sort(c);
        String prev = new String(c);
        list.add(words[0]);
        for(int i=1;i<words.length;i++){
            char[] ch = words[i].toCharArray();
            Arrays.sort(ch);
            String curr = new String(ch);
            if(curr.equals(prev)) continue;
            else{
                list.add(words[i]);
                prev = curr;
            }
        }
        return list;
    }
}