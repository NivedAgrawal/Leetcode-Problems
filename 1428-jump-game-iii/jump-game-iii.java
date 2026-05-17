class Solution {
    public boolean canReach(int[] arr, int start) {
       int len = arr.length;
       boolean[]  v = new boolean[len];
       Queue<Integer> q = new LinkedList<>();
       q.offer(start);

       while(!q.isEmpty()){
        int i = q.poll();
        if(i<0 || i>=len || v[i])
        continue;

        if(arr[i]==0) return true;

        v[i] = true;
        q.offer(i+arr[i]);
        q.offer(i-arr[i]);
       }
       return false;
    }
}