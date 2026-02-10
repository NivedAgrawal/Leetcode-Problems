class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list=new ArrayList<>();
        for(String str:words){
        StringBuilder stb=new StringBuilder();
            for(char ch:str.toCharArray()){
                if(ch!=separator){
                    stb.append(ch);
                }
                else{
                    if(stb.length()>0){
                    list.add(stb.toString());
                    stb.setLength(0);
                }
                }
            }
            if(stb.length()>0){
            list.add(stb.toString());}
        }
        return list;
    }
}