class Solution {
    public int climbStairs(int n) {
//         int number;
        
//         for(int i = 0 ; i < n )
        
        if(n == 1)
            return 1;
        
        int first = 1;
        int second = 2;
        
        for(int i = 3 ; i <= n;i++){
            int third = first + second;
            first = second;
            second = third;
        }
        
        return second;
    }
}