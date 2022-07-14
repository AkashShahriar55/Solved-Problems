class Solution {
    int ways = 0;
    
    public int findTargetSumWays(int[] nums, int target) {
        
        if(nums == null && nums.length == 0)
            return 0;
        
        dfs(nums,target,0,1);
        dfs(nums,target,0,-1);
        return ways;
    }
    
    
    private void dfs(int[] nums , int targetValue , int position,int multiplyer){
        
        int newTarget = targetValue - multiplyer * nums[position];
        
        
        if(position == nums.length-1 && newTarget == 0){
            ways++;
            return;
        }else if( position == nums.length-1){
            return;
        }
        
        position++;
        dfs(nums,newTarget,position,1);
        dfs(nums,newTarget,position,-1);
        
        
    }
}