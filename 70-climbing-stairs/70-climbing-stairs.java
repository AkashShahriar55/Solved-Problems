class Solution {
    public int climbStairs(int n) {
        
        int[] dp = new int[2];
        
        for(int i = 1; i <= n;i++){
            if(i == 1){
                 dp[1] = 1;
                continue;
            }
               
            if(i == 2){
                dp[0] = 1;
                dp[1] = 2;
                continue;
            }
             
            int temp = dp[1];
            dp[1] = dp[0]+dp[1];
            dp[0] = temp;
            
        }
        
        
        return dp[1];
        
    }
}