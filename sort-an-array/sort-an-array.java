class Solution {
    /**
    
    divide and conquor 
    
    sort(nums):
        if(nums.size = 1) return nums
        left = nums.left , right = nums.right
        sort(left)
        sort(right)
        mergedArray = merge(left,right)
        return mergedArray
    
    **/
    
    
    public int[] sortArray(int[] nums) {
        
        if(nums.length == 1)
            return nums;
        
        // divi
        int pivot = nums.length/2;
        int[] left = sortArray(Arrays.copyOfRange(nums,0,pivot));
        int[] right = sortArray(Arrays.copyOfRange(nums,pivot,nums.length));
        
        
        int[] merge = mergeSort(left,right);
        
        return merge;
        
        
    }
    
    
    private int[] mergeSort(int[] array1, int[] array2){
        int[] mergedArray = new int[array1.length+array2.length];
        
        int pointer1 = 0;
        int pointer2 = 0;
        int mergePointer = 0;
        while(pointer1 < array1.length || pointer2 < array2.length){
            if(pointer1 < array1.length && (pointer2 >= array2.length || array1[pointer1] < array2[pointer2])){
                mergedArray[mergePointer] = array1[pointer1];
                pointer1++;
            }else{
                mergedArray[mergePointer] = array2[pointer2];
                pointer2++;
            }
            
            mergePointer++;
        }
        
        return mergedArray;
        
    }
    
    
   
    
    
    
    
    
}