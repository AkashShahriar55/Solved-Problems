class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> subArray = new ArrayList();
        
        subArray.add(nums[nums.length-1]);
        ans.add(subArray);
        
        for(int i = nums.length-2;i>=0;i--){
            int number = nums[i];
            List<List<Integer>> subAns = new ArrayList();
            for(List<Integer> subArr : ans){
                for(int j = 0;j<=subArr.size();j++){
                    subArr.add(j,number);
                    List<Integer> newSub = new ArrayList(subArr);
                    subArr.remove(j);
                    subAns.add(newSub);
                }
                
            }
            ans = subAns;
            
        }
        
        
        
        return ans;
        
    }
}