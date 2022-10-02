class Solution {
    
    
    /**
    
    for 1 -> 1 -> 1 step
    for 2 -> 1+1, 2 -> 2 step
    for 3 -> 1+ 1+1 , 1+ 2, 2+1 -> 3
    for 4 -> 1+1+1+ 1, 1+ 3, 3+1, 2+2, 4 -> 5 step 
    
    
    **/
    
    HashMap<Integer,Integer> cache = new HashMap();
    
    public int climbStairs(int n) {
        if(cache.containsKey(n))
            return cache.get(n);
        
        int result = -1;
        if(n <= 2)
            result = n;
        else
            result = climbStairs(n-1)+climbStairs(n-2);
        
        cache.put(n,result);
        return result;
    }
}