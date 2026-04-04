class Solution {
    public String decodeCiphertext(String s, int rows) {
      int len = s.length();
      int column = len/rows;
      Character[][] st = new Character[rows][column];
      int n=0;
      for(int i = 0;i<rows;i++){
        for(int j=0;j<column;j++){
            st[i][j] = s.charAt(n++);
        }
      }
      StringBuilder sb = new StringBuilder();

        for(int i = 0;i<column;i++){
            int k = 0,j = i;
            while(k<rows && j<column)
            sb.append(st[k++][j++]);
        }
        int end =sb.length() - 1;
        while (end >= 0 && sb.charAt(end) == ' ') {
            end--;
        }
      return sb.substring(0,end+1).toString();
    }
}