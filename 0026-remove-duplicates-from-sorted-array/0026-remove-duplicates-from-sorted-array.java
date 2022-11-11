class Solution {
    public int removeDuplicates(int[] nums) {
        int position = 1;
        
        for(int i = 1; i < nums.length;i++){
            // System.out.println(" " + position + " " + i);
            if(nums[i] == nums[i-1]){
                continue;
            }else{
                nums[position] = nums[i];
                position++;
            }
        }
        
        return position;
    }
    
    
}