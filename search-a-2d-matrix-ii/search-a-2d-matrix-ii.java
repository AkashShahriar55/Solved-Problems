class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        
       
        
        
        return dacSearch(matrix,0,matrix[0].length-1,0,matrix.length-1,target);
        
    }
    
    private boolean dacSearch(int[][] matrix, int startX,int endX , int startY , int endY,int target){
        
        // System.out.println(startX + " " + endX+ " " + startY + " " + endY);
        
        //  for(int i = startY; i <= endY;i++){
        //     for(int j = startX; j <= endX;j++){
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        if(startX == endX){
            for(int i = startY ; i <= endY;i++){
                
                if(matrix[i][startX] == target)
                    return true;
            }
            
            return false;
        }
        
        if(startY == endY){
            for(int i = startX ; i <= endX;i++){
                if(matrix[startY][i] == target)
                    return true;
            }
            
            return false;
        }
        
        
        
        
        int pivotX = startX+ (endX-startX)/2;
        
        int pivotY = startY+ (endY-startY)/2;
        
        System.out.println();
        // System.out.println(pivotX + " " + pivotY);
        
        //3 4 0 2 
        // 3 1 
        
        
        if(target >= matrix[startY][startX] && target <= matrix[pivotY][pivotX]){
            // System.out.println("tl");
            if(dacSearch(matrix,startX,pivotX,startY,pivotY,target))
                return true;
        }
        
        if(target >= matrix[startY][pivotX+1] && target <= matrix[pivotY][endX]){
            // System.out.println("tr " + matrix[pivotY+1][startX] + " " + matrix[endY][pivotX]);
            if(dacSearch(matrix,pivotX+1,endX,startY,pivotY,target))
                return true;
        }
        
        if(target >= matrix[pivotY+1][startX] && target <= matrix[endY][pivotX]){
            // System.out.println("bl");
            if(dacSearch(matrix,startX,pivotX,pivotY+1,endY,target))
                return true;
        }
        
        if(target >= matrix[pivotY+1][pivotX+1] && target <= matrix[endY][endX]){
            // System.out.println("br");
            if(dacSearch(matrix,pivotX+1,endX,pivotY+1,endY,target))
                return true;
        }
        
        
        return false;
        
        
        
    }
}