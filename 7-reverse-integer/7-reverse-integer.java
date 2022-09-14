class Solution {
    public int reverse(int x) {
        int flag = 1;
        int target = x;
        if(x < 0){
            flag = -1;
            target *= flag;
        }
        
       
        
        long result = 0;
        
        while(target != 0){
            int reminder = target %10;
            target = target/10;
            result = result *10 + reminder;
        }
        
      
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
            return 0;
        
        return (int) result * flag;
        
    }
}