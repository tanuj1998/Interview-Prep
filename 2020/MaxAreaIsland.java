class Solution {
    public int helper(int[][] grid, int value, int row, int col){
        if(row < 0 || col < 0 || 
           row == grid.length || col == grid[0].length 
           || grid[row][col] == 0){
            return 0; 
        }

        int size = 0;
        if(grid[row][col] == value){
            grid[row][col] = 0; //mark as visited
            size = 1;
            
            //visit adjacent sides
            size += helper(grid, value, row-1, col);
            size += helper(grid, value, row+1, col);
            size += helper(grid, value, row, col-1);
            size += helper(grid, value, row, col+1);
        }
        return size;
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    ans = Math.max(ans,helper(grid,grid[i][j],i,j));
                }
            }
        }
        return ans;
    }
}