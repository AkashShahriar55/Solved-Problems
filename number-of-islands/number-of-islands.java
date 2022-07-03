class Solution {
    
    public final List<int[]> directions = Arrays.asList(
        new int[] {1,0}, //top
        new int[] {0,-1}, // left
        new int[] {-1,0}, // bottom
        new int[] {0,1} // right
    );
    
    public int numIslands(char[][] grid) {
        
        int m = grid.length;
        if(m == 0)
            return 0;
        int n = grid[0].length;
        
        
        Queue<int[]> q = new LinkedList();
        
        
        
        int count = 0;
        for(int i = 0; i < m;i++){
            for(int j = 0; j< n;j++){
                int[] position = new int[]{i,j};
                if(grid[i][j] == '1'){
                    q.add(position);
                    grid[i][j] = '0';
                    // System.out.println("starting with " + i + " " + j + "\n");
                    while(!q.isEmpty()){
                        int[] node = q.poll();
                        int row = node[0];
                        int col = node[1];
                        // System.out.println( "visiting "+  row + " " + col + "\n" );
                       
                        for(int[] direction : directions){
                            int r = row + direction[0];
                            int c = col + direction[1];
                            
                            if( r < 0 || r >= m || c < 0 || c >= n || grid[r][c] != '1')
                            {
                                continue;
                            }
                            // System.out.println(r + " " + c);
                            grid[r][c] = '0';
                            q.add(new int[]{r,c});
                            
                        }
                        
                        // System.out.println();
                        
                    }
                    
                    // System.out.println("------------");
                    count++;
                }
            }
        }
        
        return count;
    }
}