class Solution {
    
    /**
        psudoboard[n]:
        quens position pb[row] == column
        no queen pb[row] == -1
        
        is safe - row, col:
            if pb[row] == -1
            if pb[i] != col; where i -> 0..n
            if abs(i - row) != abs(pb[i] - col ) where i -> 0..n
            
        place queen -> pb[row] = col;
        remove queen -> pb[row] = -1;
            
    **/
    
    int[] psudoBoard;

    
    public int totalNQueens(int n) {
        psudoBoard = new int[n];
        for(int i = 0; i < n;i++)
            psudoBoard[i] = -100;
        
        return backtracking(0,0);
    }
    
    
    private int backtracking(int row,int count){
        for(int i = 0; i < psudoBoard.length;i++){
            // System.out.println(row+" " + i + " " + isSafe(row,i) + " "+ count) ;
            if(isSafe(row,i)){
                placeQueen(row,i);
                if(row + 1 == psudoBoard.length)
                    count++;
                else
                    count = backtracking(row+1,count);
                removeQueen(row,i);
            }
        }
        
        return count;
    }
    
    private boolean isSafe(int row, int col){

        
        if(psudoBoard[row] != -100)
            return false;
        
        for(int i = 0; i< psudoBoard.length;i++){
            if(psudoBoard[i] == col)
                return false;
            
            if(Math.abs(i-row) == Math.abs(psudoBoard[i] - col))
                return false;
        }
        
        
        return true;
    }
    
    
    private void placeQueen(int row, int col){
        psudoBoard[row] = col;
    }
    
    private void removeQueen(int row,int col){
        psudoBoard[row] = -100;
    }
    
    
    
    
    
    
}