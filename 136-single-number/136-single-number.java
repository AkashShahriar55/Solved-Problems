class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> count = new HashMap();
        
        for(int i = 0;i<nums.length;i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }
        
        for(Integer number : count.keySet()){
            if(count.get(number) == 1)
                return number;
        }
        
        
        return 0;
    }
}