class Solution {
    public boolean removeOnes(int[][] grid) {
        int[][] newGrid = new int[grid.length][grid[0].length];
        
        for(int c = 0; c< grid[0].length;c++){
            if(grid[0][c] != newGrid[0][c]){
                for(int r = 0;r < grid.length;r++){
                    newGrid[r][c] = newGrid[r][c] == 0 ? 1 : 0; 
                }
            }
        }
        
        for(int r = 0;r < grid.length;r++){
            if(grid[r][0] != newGrid[r][0]){
                for(int c = 0; c< grid[r].length;c++){
                    newGrid[r][c] = newGrid[r][c] == 0 ? 1 : 0; 
                }
            }
        }
        
        for(int r = 0;r < grid.length;r++){
            for(int c = 0; c< grid[r].length;c++){
                if(grid[r][c] != newGrid[r][c]){
                    return false;
                }
            }
        }
        
        
        return true;
        
        
    }
}