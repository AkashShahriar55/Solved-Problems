class Solution {
    public int jump(int[] nums) {
        
        int len = nums.length;
        if(len <= 1)
            return 0;
        
        int step = 0;
        int ptr = 0;
        while(true){
            // System.out.println(ptr + " " + step);
            int jumpSize = nums[ptr];
            
            int maxPosition = -1;
            int maxNumber = Integer.MIN_VALUE;
            
            if(ptr+jumpSize >= len-1)
                return ++step;
            
            
            for(int j = 0; j < jumpSize ; j++ ){
                ptr++;
                
                if(nums[ptr]-jumpSize+j+1 >= maxNumber){
                    maxNumber = nums[ptr]-jumpSize+j+1;
                    maxPosition = ptr;
                }
                
            }
            
            ptr = maxPosition;
            step++;
        }
        
        
    }
}