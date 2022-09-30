class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length;i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }
        
        int changedMin = 0;
        int changedMax = max-min;
        
        
        int[] count = new int[changedMax+1];
        
        for(int i = 0 ; i< arr.length;i++){
            count[arr[i]-min] += 1;
        }
        
        
        List<List<Integer>> minDiffList = new ArrayList();
        int minDiff = Integer.MAX_VALUE;
        int prevNo = -1;
        int nextNo = -1;
        for(int i = 0; i< count.length;){
            if(count[i] == 0){
                i++;
                continue;
            } 
            
            if(prevNo == -1){
                prevNo = i;
                count[i]-=1;
                continue;
            }
            
            
            nextNo = i;
            
            if(nextNo - prevNo < minDiff){
                minDiffList.clear();
                List<Integer> tupple = new ArrayList();
                tupple.add(prevNo+min);
                tupple.add(nextNo+min);
                minDiffList.add(tupple);
                minDiff = nextNo-prevNo;
                count[i]-=1;
                
                prevNo = nextNo;
            }else if( nextNo - prevNo == minDiff){
                List<Integer> tupple = new ArrayList();
                tupple.add(prevNo+min);
                tupple.add(nextNo+min);
                minDiffList.add(tupple);
                count[i]-=1;
                
                prevNo = nextNo;
            }else{
                count[i]-=1;
                
                prevNo = nextNo;
            }
            
            
            
        }
        
        return minDiffList;
        
        
    }
}