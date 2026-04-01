class Solution {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> list = new ArrayList<>();
        int k = 1;
        while(m-->=0){
            list.add(k++);
        }
        int[] ans = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int n = queries[i];
            int idx = list.indexOf(n);
            System.out.println(idx);
            ans[i] = idx;
            list.remove(idx);
            list.add(0,n);
        }
        return ans;
    }
}