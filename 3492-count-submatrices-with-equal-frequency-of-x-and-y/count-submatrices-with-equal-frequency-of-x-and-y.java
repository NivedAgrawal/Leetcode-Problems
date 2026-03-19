class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int ans = 0;
        int[] sumx = new int[grid[0].length];
        int[] sumy = new int[grid[0].length];
        // for(int i=0;i<grid.length;i++){
        //     for(int j=0;j<grid[0].length;j++){
        //         if(grid[i][j]=='X'){
        //             sum += 1;
        //         }
        //         else if(grid[i][j]=='Y'){
        //             sum += -1;
        //         }
        //         presum[i][j] += sum; 
        //     }
        // }

        for(int i=0;i<grid.length;i++){
            int x = 0,y = 0;
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='X') x++;
                else if(grid[i][j]=='Y') y++;

                sumx[j] += x;
                sumy[j] += y;

                if(sumx[j]>0 && sumy[j]==sumx[j]) ans++;
            }
        }
        return ans;
    }
}