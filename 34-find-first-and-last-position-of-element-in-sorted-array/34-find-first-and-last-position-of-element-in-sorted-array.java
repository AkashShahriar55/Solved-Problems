class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        
        
        while(left < right){
            mid = left + (right-left)/2;
            // System.out.println(target+ " " + nums[left] +
            //                   " " + nums[mid]+
            //                   " " + nums[right]);
            if(target <= nums[mid]){
                right = mid;
            }else{
                left = mid +1;
            }
            
        }
        

        
        int[] ans = new int[2];
        ans[0] = left;
        
        while(left < nums.length && nums[left] == target){
            left++;
        }
        
        ans[1] = left-1;
        
        
        if(ans[1] < ans[0])
            return new int[]{-1,-1};
        
        return ans;
        
    }
}