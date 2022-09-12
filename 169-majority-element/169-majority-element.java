class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer,Integer> count = new HashMap();
        int size = nums.length/2;
        if(nums.length % 2 != 0)
            size++;
        
        for(int num : nums){
            int counter = count.getOrDefault(num,0)+1;
            if(counter >= size)
                return num;
            count.put(num,counter);
            
            
        }
        
        return 0;
        
        
    }
}