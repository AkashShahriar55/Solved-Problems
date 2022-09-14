class Solution {
    public int maxArea(int[] height) {
        
        int globalMax = 0;
        
        for(int i = 0,j = height.length -1; i< j;)
        {
            
            int h = Math.min(height[i],height[j]);
            int w = j-i;
            int area = h * w;

            globalMax = Math.max(globalMax,area);
            
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
            
        }   
        
        return globalMax;
    }
}