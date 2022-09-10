class Solution {
    
  
    public int findKthLargest(int[] nums, int k) {
        // constructing a heap 0 indexed
        int[] minHeap = new int[k];

        
        for(int i = 0; i < nums.length ; i++){
            // creating heap until k elements
            // discarding smaller element after heap size k
            if(i < k){
                minHeap[i] = nums[i];
                
                int index = i;
                int parent = (i+1)/2 - 1;
                

                 // System.out.println(index + " " + parent);
                while(index > 0 && minHeap[index] < minHeap[parent] ){
                    // System.out.println(index + " " + parent);
                    int temp = minHeap[index];
                    minHeap[index] = minHeap[parent];
                    minHeap[parent] = temp;
                    index = parent;
                    parent = (index+1)/2 -1 ;
                }
                
         
                
                
            }else if(nums[i] >= minHeap[0]){
                minHeap[0] = nums[i];
                minHeapify(minHeap,0);
            }
            
            
            // for(int j = 0 ; j < minHeap.length ; j++){
            //      System.out.println(minHeap[j]);
            // }
           
        }
        
        
        return minHeap[0];
        
    }
    
    
    public void minHeapify(int[] minHeap,int index){
        int left = index*2 + 1;
        int right = index*2 + 2;
        int min = index;
        
        if(left < minHeap.length && minHeap[left] < minHeap[min]){
            min = left;
        }
        
        if(right < minHeap.length && minHeap[right] < minHeap[min]){
            min = right;
        }
        
        if(min != index){
            int temp = minHeap[index];
            minHeap[index] = minHeap[min];
            minHeap[min] = temp;
            index = min;
            minHeapify(minHeap,index);
        }
        
        
        
    }
    
    
    
    
    
    
}