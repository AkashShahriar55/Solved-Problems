class Solution {
    public void sortColors(int[] nums) {
        
        
        int max = -1;
        for(int i =0; i< nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        
        int[] counts = new int[max+1];
        
        for(int i = 0 ; i< nums.length; i++){
            counts[nums[i]] += 1;
        }
        
        
        int cumulativeSum = 0;
        for(int i = 0; i< counts.length;i++){
            int temp = counts[i];
            counts[i] = cumulativeSum;
            cumulativeSum+=temp;
        }
        
        
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length;i++){
            result[counts[nums[i]]] = nums[i];
            counts[nums[i]]+=1;
        }
        
        for(int i = 0; i< nums.length;i++){
            nums[i] = result[i];
        }
        
    
        
        
    }
}